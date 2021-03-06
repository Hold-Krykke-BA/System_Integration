package holdkrykke.mp1.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

// Create grpc server at port 8080 and add the service to it
// Start the grpc service by running this main method
public class BuildServer
{
            public static void main(String[] args) throws IOException, InterruptedException
            {
                  Server server = ServerBuilder.forPort(6565)
                          .addService(new BuildService()).build();
                  
                  System.out.println("Starting server...");
                  server.start();
                  System.out.println("Server started!");
                  server.awaitTermination();
            }
      }
