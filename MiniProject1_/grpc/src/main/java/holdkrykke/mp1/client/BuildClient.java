package holdkrykke.mp1.client;

import holdkrykke.mp1.RegisterServiceGrpc;
import holdkrykke.mp1.RegisterStudypointsRequest;
import holdkrykke.mp1.StudypointResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;


@Component
public class BuildClient
{
    public static void main(String[] args)
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        RegisterServiceGrpc.RegisterServiceBlockingStub stub
                = RegisterServiceGrpc.newBlockingStub(channel);

        StudypointResponse response = stub.register(RegisterStudypointsRequest.newBuilder()
                .setStudentID(args[0])
                .setAssignmentID(args[1])
                .setAssignmentCompleted(args[2])
                .setReviewCompleted(args[3])
                .build());

        System.out.println("Response received from server:\n" + response);

        channel.shutdown();
    }
}
