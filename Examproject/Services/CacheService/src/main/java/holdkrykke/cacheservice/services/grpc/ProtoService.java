package holdkrykke.cacheservice.services.grpc;

import holdkrykke.cacheservice.services.RegisterServiceGrpc;
import holdkrykke.cacheservice.services.RegisterStudypointsRequest;
import holdkrykke.cacheservice.services.StudypointResponse;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ProtoService extends RegisterServiceGrpc.RegisterServiceImplBase{

    @Override
    public void register(RegisterStudypointsRequest request, StreamObserver<StudypointResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

//        String archivedInfo = archiveData(request) + " studypoints assigned to " + request.getStudentID();
//        StudypointResponse response = StudypointResponse.newBuilder()
//                .setArchivedInfo(archivedInfo)
//                .build();

//        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
