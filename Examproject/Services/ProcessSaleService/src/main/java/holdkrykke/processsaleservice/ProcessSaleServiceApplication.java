package holdkrykke.processsaleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ProcessSaleServiceApplication {

    public static void main(String... args) {
        SpringApplication.run(ProcessSaleServiceApplication.class, args);
    }

}
