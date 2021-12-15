package holdkrykke.cacheservice.services.grpc;

import holdkrykke.cacheservice.services.ApplicationService;
import holdkrykke.cacheservice.services.RegisterServiceGrpc;
import holdkrykke.cacheservice.services.RegisterRequest;
import holdkrykke.cacheservice.services.ProtoResponse;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ProtoService extends RegisterServiceGrpc.RegisterServiceImplBase{
    private static final Logger logger = LoggerFactory.getLogger(ProtoService.class);

    @Autowired
    private ApplicationService applicationService;

    @Override
    public void register(RegisterRequest request, StreamObserver<ProtoResponse> responseObserver) {
        logger.info("Request received from client [{}]", request);
        String retrieved = handleRequest(request); // set response to bloom
        ProtoResponse response = ProtoResponse.newBuilder()
                .setRetrieved(retrieved)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private String handleRequest(RegisterRequest request){
        String parameterISBN = request.getIsbn();
        List<String> parameterAUTHORS = request.getAuthorsList();
        String parameterTITLE = request.getTitle();
        return "am a hat"; // response object/list as stringified
    }
}
