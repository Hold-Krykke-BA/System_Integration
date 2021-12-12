package holdkrykke.registersaleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@EnableMongoRepositories
@SpringBootApplication
public class RegisterSaleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterSaleServiceApplication.class, args);
    }

}
