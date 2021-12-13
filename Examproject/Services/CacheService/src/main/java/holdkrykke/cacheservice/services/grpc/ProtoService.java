package holdkrykke.cacheservice.services.grpc;

import holdkrykke.cacheservice.services.RegisterServiceGrpc;
import holdkrykke.cacheservice.services.RegisterRequest;
import holdkrykke.cacheservice.services.ProtoResponse;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ProtoService extends RegisterServiceGrpc.RegisterServiceImplBase{

    @Override
    public void register(RegisterRequest request, StreamObserver<ProtoResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        String retrieved = "am a hat"; // set response to bloom
        ProtoResponse response = ProtoResponse.newBuilder()
                .setRetrieved(retrieved)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
