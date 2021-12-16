package holdkrykke.cacheservice.services.grpc;

import com.google.gson.Gson;
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

import java.util.ArrayList;
import java.util.List;

public class ProtoService extends RegisterServiceGrpc.RegisterServiceImplBase {
    private static final Logger logger = LoggerFactory.getLogger(ProtoService.class);

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
    private BookCacheRepository redisRepo;

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
        Gson gson = new Gson();
        String isbn = request.getIsbn();
        List<String> authors = request.getAuthorsList();
        String title = request.getTitle();

        //todo Try to build json object
        //if query by isbn:
        //isbn: <data>
        //author: <null>
        //title: <null>
        //todo may be useful to create exit condition for isbn cache lookup instead, so it can do the last part of the flow too

        List<ResponseDTO> isbnResponse = new ArrayList<>();

        if (isbn != null && !isbn.isBlank()) {
            //Could check ISBN through SOAP-REST
            System.out.println(isbn);
            var result = redisRepo.findBookByIdAndRefreshExpiration(isbn);
            if (result != null) {
                //early exit, cache had what we needed
                isbnResponse.add(transformData(result));
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

        //todo call price/quantity if not already
        //todo transform to larger json string object

        return "am a hat"; // response object/list as stringified
    }

    /**
     * Utility method to transform cache items from data stores to purchaseable OrderItems
     */
    private ResponseDTO transformData(BookCacheDTO book) {
        //Create constructor to copy values
        throw new UnsupportedOperationException();

    }

    /**
     * Utility method to transform data from external data stores to purchaseable OrderItems
     */
    private ResponseDTO transformData(String book) {
        //How?
        throw new UnsupportedOperationException();
    }

    /**
     * Utility method to transform data from internal data stores to purchaseable OrderItems
     */
    private ResponseDTO transformData(Book book) {
        //Create constructor to copy values
        throw new UnsupportedOperationException();
    }

    /**
     * Utility method to transform data from internal data stores to purchaseable OrderItems
     */
    private List<ResponseDTO> transformData(List<Book> book) {
        //For item in list, call transformData(book)
        throw new UnsupportedOperationException();
    }

    /**
     * Utility method to randomize price if missing
     */
    private double randomizePrice() {
        throw new UnsupportedOperationException();

    }

    /**
     * Utility method to randomize quantity if missing
     */
    private int randomizeQuantity() {
        throw new UnsupportedOperationException();

    }
}
