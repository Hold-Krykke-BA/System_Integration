package holdkrykke.cacheservice;

import holdkrykke.cacheservice.services.grpc.ProtoService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import java.io.IOException;


@SpringBootApplication
@EnableRedisRepositories
@EnableMongoRepositories
public class CacheServiceApplication {

    public static void main(String[] args) throws IOException, InterruptedException{

        //For this application as a whole:
        //Request for book
        //Check cache
        //If in cache, refresh the TTL and return the data (done)
        //if NOT in cache, get from external sources, put in cache, return data

        SpringApplication.run(CacheServiceApplication.class, args);

        // gRPC Server
        Server server = ServerBuilder.forPort(6000)
                .addService(new ProtoService()).build();
        server.start();
        server.awaitTermination();
    }
}