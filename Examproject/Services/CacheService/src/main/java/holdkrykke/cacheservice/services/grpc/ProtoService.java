package holdkrykke.cacheservice.services.grpc;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
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
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProtoService extends RegisterServiceGrpc.RegisterServiceImplBase {
    private static final Logger logger = LoggerFactory.getLogger(ProtoService.class);
    private Gson gson = new Gson();

//    getBook from gRPC
//
//    check parameters
//
//
//    getByCache --> findByIdAndRefresh --> return
//
//            else
//
//    check local
//    check external
//            (assuming found)
//    transform to BookCacheDTO, add to cache
//    transform to Book (or OrderItem or whatever), fake missing types, return
//
//            if not found, return empty
//
//
//
//------
//    From camel description:
//            ------
//    Transform book types (BookCacheDTO, ResponseDTO, Book)
//    Aggregate similar books
//    Add missing types

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

        //todo Try to build json object
        //if query by isbn:
        //isbn: <data>
        //author: <null>
        //title: <null>
        //todo may be useful to create exit condition for isbn cache lookup instead, so it can do the last part of the flow too
        //todo jsonObject constructor in ResponseDTO

        List<ResponseDTO> isbnResponse = new ArrayList<>();

        if (isbn != null && !isbn.isBlank()) {
            //Could check ISBN through SOAP-REST
            System.out.println(isbn);
            var result = cacheRepository.findBookByIdAndRefreshExpiration(isbn);
            if (result != null) {
                //early exit, cache had what we needed
                isbnResponse.add(transformData(result));
                logger.info("Requested isbn resolved in cache\n[{}]", result);
                return gson.toJson(isbnResponse);
            }
        } else {
            System.out.println("Blank isbn");
        }


        List<ResponseDTO> authorResponse = new ArrayList<>();

        if (authors.size() > 0) {
            var resultInternal = bookRepository.findByAuthors(authors.toArray(new String[0]));
            authorResponse.addAll(transformData(resultInternal));
            var resultExternal = externalService.getBooksByAuthor(authors); //todo needs own method :(
            authorResponse.add(transformData(resultExternal)); //todo needs other add too, probably

        } else {
            System.out.println("Blank author");
        }

        List<ResponseDTO> titleResponse = new ArrayList<>();


        if (title != null && !title.isBlank()) {
            System.out.println(title);
            var resultInternal = bookRepository.findByTitle(title);
            titleResponse.addAll(transformData(resultInternal));
            var resultExternal = externalService.getBooksByTitle(title); //todo needs own method :(
            titleResponse.add(transformData(resultExternal));//todo needs other add too, probably

        } else {
            System.out.println("Blank title");
        }

        //todo put in cache before return as bookcachedto
        //todo call price/quantity if not already
        //todo transform to larger json string object

        return "am a hat"; // response object/list as stringified
    }

    /**
     * Utility method to transform cache items from data stores to purchaseable OrderItems
     */
    private ResponseDTO transformData(BookCacheDTO book) {
        ResponseDTO transformation = new ResponseDTO(book);
        return arrangeFields(transformation);
    }

    /**
     * Utility method to transform data from external data stores to purchaseable OrderItems
     */
    private ResponseDTO transformData(String book) {
        ResponseDTO transformation;

        System.out.println("String book found!::\n" + book);

        //Parse from String to JsonObject
        var intermediary = gson.fromJson(book, JsonObject.class);

        System.out.println("String book to JsonElement::\n" + intermediary.toString());

        //Create new ResponseDTO based on JsonObject
        transformation = new ResponseDTO(intermediary);

        return arrangeFields(transformation);
    }

    /**
     * Utility method to transform data from internal data stores to purchaseable OrderItems
     */
    private ResponseDTO transformData(Book book) {
        ResponseDTO transformation = new ResponseDTO(book);
        return arrangeFields(transformation);
    }

    /**
     * Utility method to transform data from internal data stores to purchaseable OrderItems
     */
    private List<ResponseDTO> transformData(List<Book> books) {
        List<ResponseDTO> result = new ArrayList<>();
        for (Book book : books) {
            result.add(transformData(book));
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
            System.out.println(String.format("Arranging field price, was: %d and is now %d", _price, dto.getPrice()));
        }
        if (_quantity == -1) { //todo fix or move
            dto.setQuantity(randomizeQuantity());
            System.out.println(String.format("Arranging field quantity, was: %d and is now %d", _quantity, dto.getQuantity()));
        }
        if (_type == null || _type.isBlank()) {
            dto.setType(randomizeType());
            System.out.println(String.format("Arranging field type, was: %d and is now %d", _type, dto.getType()));
        }
        return dto;
    }

    /**
     * Utility method to randomize price if missing
     */
    private double randomizePrice() {
        return 100.25;

    }

    /**
     * Utility method to randomize quantity if missing
     */
    private int randomizeQuantity() {
        return 123;
    }

    /**
     * Utility method to randomize book type if missing
     */
    private String randomizeType() {
        return "book";
    }
}
