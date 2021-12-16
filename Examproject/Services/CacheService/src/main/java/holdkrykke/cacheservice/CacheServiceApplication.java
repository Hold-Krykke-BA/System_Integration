package holdkrykke.cacheservice;

import holdkrykke.cacheservice.services.grpc.ProtoService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import java.io.IOException;


@SpringBootApplication
@EnableRedisRepositories
@EnableMongoRepositories
public class CacheServiceApplication {
    private static final Logger logger = LoggerFactory.getLogger(CacheServiceApplication.class);

    @Autowired
    private ProtoService protoService;

    public static void main(String[] args) {
        SpringApplication.run(CacheServiceApplication.class, args);
    }


    @Bean
    void startGRPCServer() throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(6000)
                .addService(protoService).build();
        server.start();
        logger.info("Starting gRPC server on port [{}]", server.getPort());
        //server.awaitTermination(); //is handled by Spring instead
    }

}