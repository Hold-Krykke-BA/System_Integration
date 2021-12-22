package holdkrykke.cacheservice.services.grpc;

import com.google.gson.*;
import holdkrykke.cacheservice.exceptions.NotFoundException;
import holdkrykke.cacheservice.models.Book.Book;
import holdkrykke.cacheservice.models.grpc.ResponseDTO;
import holdkrykke.cacheservice.models.redis.BookCacheDTO;
import holdkrykke.cacheservice.repositories.mongo.BookRepository;
import holdkrykke.cacheservice.repositories.redis.BookCacheRepository;
import holdkrykke.cacheservice.services.RegisterServiceGrpc;
import holdkrykke.cacheservice.services.RegisterRequest;
import holdkrykke.cacheservice.services.ProtoResponse;
import holdkrykke.cacheservice.services.external.ExternalService;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class ProtoService extends RegisterServiceGrpc.RegisterServiceImplBase {
    private static final Logger logger = LoggerFactory.getLogger(ProtoService.class);
    private Gson gson = new GsonBuilder().registerTypeAdapter(Double.class, (JsonSerializer<Double>) (src, typeOfSrc, context) -> {
        DecimalFormat df = new DecimalFormat("#,00"); //todo fix json double representation. Try 0,00 if issues
        df.setRoundingMode(RoundingMode.CEILING);
        return new JsonPrimitive(Double.parseDouble(df.format(src)));
    }).create();

    @Autowired
    private BookCacheRepository cacheRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ExternalService externalService;

    @Override
    public void register(RegisterRequest request, StreamObserver<ProtoResponse> responseObserver) {
        logger.info("Request received from client\n[{}]", request);
        String retrieved = null; // set response to client
        try {
            retrieved = handleRequest(request);
            ProtoResponse response = ProtoResponse.newBuilder()
                    .setRetrieved(retrieved)
                    .build();
            responseObserver.onNext(response);
        } catch (NotFoundException e) {
            logger.error("gRPC request error \n[{}]", e);
            responseObserver.onError(e);
        }
        responseObserver.onCompleted();
    }

    /**
     * Handles a gRPC request by the main application flow and returns
     *
     * @param request
     * @return
     * @throws NotFoundException
     */
    private String handleRequest(RegisterRequest request) throws NotFoundException {
        String isbn = request.getIsbn();
        List<String> authors = request.getAuthorsList();
        String title = request.getTitle();


        //Handle ISBN
        List<ResponseDTO> isbnResponse = new ArrayList<>();
        if (isbn != null && !isbn.isBlank()) {
            //Could check ISBN through SOAP-REST
            var result = cacheRepository.findBookByIdAndRefreshExpiration(isbn);
            if (result != null) {
                //early exit, cache had what we needed
                isbnResponse.add(transformAndCacheData(result));
                logger.info("Requested isbn resolved in cache\n[{}]", result);
                return gson.toJson(isbnResponse);
            } else {
                //not in cache, regular lookup
                var resultInternal = bookRepository.findByIsbn(isbn);
                var transformationInt = transformAndCacheData(resultInternal);
                if (transformationInt != null) isbnResponse.add(transformationInt);

                var resultExternal = externalService.getBooksByISBN(isbn);
                var transformationExt = transformAndCacheData(resultExternal);
                if (transformationExt != null) isbnResponse.add(transformAndCacheData(resultExternal));
            }
        }


        //Handle authors
        List<ResponseDTO> authorResponse = new ArrayList<>();
        if (authors.size() > 0) {
            var resultInternal = bookRepository.findByAuthors(authors.toArray(new String[0]));
            var transformationInt = transformAndCacheData(resultInternal);
            if (transformationInt != null) authorResponse.addAll(transformationInt);

            var resultExternal = externalService.getBooksByAuthor(authors); //todo needs own method maybe, if multiBook
            var transformationExt = transformAndCacheData(resultExternal);
            if (transformationExt != null) authorResponse.add(transformationExt); //todo needs other add too, maybe
        }


        //Handle title
        List<ResponseDTO> titleResponse = new ArrayList<>();
        if (title != null && !title.isBlank()) {
            var resultInternal = bookRepository.findByTitle(title);
            var transformationInt = transformAndCacheData(resultInternal);
            if (transformationInt != null) titleResponse.addAll(transformationInt);

            var resultExternal = externalService.getBooksByTitle(title); //todo needs own method maybe, if multiBook
            var transformationExt = transformAndCacheData(resultExternal);
            if (transformationExt != null) titleResponse.add(transformationExt);//todo needs other add too, maybe
        }

        //todo
        //  should be able to handle multi json objects (author, title), see its transform method
        //  maybe need to set location? external is set in constructor, assume database is set? no, make a check and set it.
        //  test


        //Transform to JSON and return
        JsonObject obj = new JsonObject();
        obj.add("isbn", gson.toJsonTree(isbnResponse));
        obj.add("authors", gson.toJsonTree(authorResponse));
        obj.add("title", gson.toJsonTree(titleResponse));

        String result = gson.toJson(obj);
        System.out.println(result);
        return result;
    }

    /**
     * Utility method to transform cache items from data stores to purchaseable OrderItems
     */
    private ResponseDTO transformAndCacheData(BookCacheDTO book) {
        if (book == null) return null;
        ResponseDTO transformation = arrangeFields(new ResponseDTO(book));
        cacheRepository.saveBook(new BookCacheDTO(transformation));
        return transformation;
    }

    /**
     * Utility method to transform data from external data stores to purchaseable OrderItems
     */
    private ResponseDTO transformAndCacheData(String book) {
        if (book == null || book.isBlank()) return null;
        ResponseDTO transformation;

        System.out.println("String book found!::\n" + book);

        //Parse from String to JsonObject
        var intermediary = gson.fromJson(book, JsonObject.class);

        System.out.println("String book to JsonElement::\n" + intermediary.toString());

        if (intermediary.get("numFound").getAsInt() == 0) {
            //api error message
            logger.info("External API did not find book");
            return null;
        }

        //todo multipleResponses (check if numFound > 1, else just add the one)
        //Load as array
        //Get only some results
        //For every array element, use new ResponseDTO constructor

        //Object is typically object.array[0].object
        //In the form of object["docs"][0][value]
        transformation = arrangeFields(new ResponseDTO(intermediary.getAsJsonArray("docs").get(0).getAsJsonObject()));
        cacheRepository.saveBook(new BookCacheDTO(transformation));
        System.out.println("JsonString transformation result: " + transformation);
        return transformation;
    }

    /**
     * Utility method to transform data from internal data stores to purchaseable OrderItems
     */
    private ResponseDTO transformAndCacheData(Book book) {
        if (book == null) return null;
        ResponseDTO transformation = arrangeFields(new ResponseDTO(book));
        cacheRepository.saveBook(new BookCacheDTO(transformation));
        return transformation;
    }

    /**
     * Utility method to transform data from internal data stores to purchaseable OrderItems
     */
    private List<ResponseDTO> transformAndCacheData(List<Book> books) {
        List<ResponseDTO> result = new ArrayList<>();
        for (Book book : books) {
            if (book == null) continue;
            result.add(transformAndCacheData(book));
        }
        return result;
    }

    /**
     * Arranges missing but necessary fields on a ResponseDTO.
     *
     * @param dto
     * @return the DTO with fixes in-place
     */
    private ResponseDTO arrangeFields(ResponseDTO dto) {
        var _price = dto.getPrice();
        var _quantity = dto.getQuantity();
        var _type = dto.getType();


        if (_price == null) {
            dto.setPrice(randomizePrice());
            System.out.println(String.format("Arranging field price, was: %6.2f and is now %6.2f", _price, dto.getPrice()));
        }
        if (_quantity == 0 || _quantity == -1) { //uninitialized int === 0. Or, if the warehouse is empty, we add some more!!
            dto.setQuantity(randomizeQuantity());
            System.out.println(String.format("Arranging field quantity, was: %d and is now %d", _quantity, dto.getQuantity()));
        }
        if (_type == null || _type.isBlank()) {
            dto.setType(randomizeType());
            System.out.println(String.format("Arranging field type, was: %s and is now %s", _type, dto.getType()));
        }
        return dto;
    }

    /**
     * Utility method to randomize price if missing
     */
    private double randomizePrice() {
        int max = 750;
        int min = 50;
        double price = ThreadLocalRandom.current().nextDouble() * (max - min) + min;
        double priceRounded = (double) Math.round(price * 100.0f) / 100.0f;
        return priceRounded;
    }

    /**
     * Utility method to randomize quantity if missing
     */
    private int randomizeQuantity() {
        int max = 500;
        int min = 2;
        int quantity = ThreadLocalRandom.current().nextInt(min, max + 1);
        return quantity;
    }

    /**
     * Utility method to randomize book type if missing
     */
    private String randomizeType() {
        String[] types = new String[]{"book", "audiobook", "ebook"};
        Random rnd = new Random();
        return types[rnd.nextInt(types.length)];
    }
}
