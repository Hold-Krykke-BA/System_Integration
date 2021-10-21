package holdkrykke.clientserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableHystrixDashboard
@EnableFeignClients
//@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class ClientserverApplication {

    public static void main(String[] args) {

        SpringApplication.run(ClientserverApplication.class, args);

    }

}

