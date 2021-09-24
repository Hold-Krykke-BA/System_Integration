package holdkrykke.mp1.server;


import dk.dd.grpc.HelloRequest;
import dk.dd.grpc.HelloResponse;
import dk.dd.grpc.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BuildService extends HelloServiceGrpc.HelloServiceImplBase
{
      @Override
      public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver)
      {
            System.out.println("Request received from client:\n" + request);
            
            String greeting = new StringBuilder().append("Hello, ")
                    .append(request.getFirstName())
                    .append(" ")
                    .append(request.getLastName())
                    .toString();
            
            HelloResponse response = HelloResponse.newBuilder()
                    .setGreeting(greeting)
                    .build();
            
            responseObserver.onNext(response);
            responseObserver.onCompleted();
      }
}
