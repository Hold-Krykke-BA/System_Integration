package holdkrykke.examinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExaminfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExaminfoApplication.class, args);
    }

}
