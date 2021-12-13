package holdkrykke.cacheservice.services.grpc;

import holdkrykke.cacheservice.services.RegisterServiceGrpc;
import holdkrykke.cacheservice.services.RegisterRequest;
import holdkrykke.cacheservice.services.ProtoResponse;
import io.grpc.stub.StreamObserver;

public class ProtoService extends RegisterServiceGrpc.RegisterServiceImplBase{

    @Override
    public void register(RegisterRequest request, StreamObserver<ProtoResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        String retrieved = handleRequest(request); // set response to bloom
        ProtoResponse response = ProtoResponse.newBuilder()
                .setRetrieved(retrieved)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private String handleRequest(RegisterRequest request){
        String parameterISBN = request.getIsbn();
        String parameterAUTHORS = request.getAuthors();
        String parameterTITLE = request.getTitle();
        return "am a hat"; // response object/list as stringified
    }
}
