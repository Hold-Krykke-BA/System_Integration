package holdkrykke.cacheservice;

import holdkrykke.cacheservice.services.grpc.ProtoService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import java.io.IOException;


@SpringBootApplication
@EnableRedisRepositories
@EnableMongoRepositories
public class CacheServiceApplication {
    private static final Logger logger = LoggerFactory.getLogger(CacheServiceApplication.class);
    public static void main(String[] args) throws IOException, InterruptedException{
        SpringApplication.run(CacheServiceApplication.class, args);

        Server server = ServerBuilder.forPort(6000)
                .addService(new ProtoService()).build();
        server.start();
        logger.info("Starting gRPC server on port [{}]", server.getPort());
        server.awaitTermination();
    }
}