package holdkrykke.cacheservice.services.camel;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CamelService {

    //todo continue from here
//    https://camel.apache.org/camel-spring-boot/3.13.x/index.html
//
//            ^Left menu for starters etc
//
//
//
//    https://camel.apache.org/manual/consumertemplate.html
//    https://camel.apache.org/manual/producertemplate.html
//    https://camel.apache.org/manual/pojo-producing.html
//    https://camel.apache.org/manual/pojo-consuming.html



//All this is fine, but how to invoke when ready? How tu return?

    //Notes for camel
//Also using ActiveMQ (rather than JMS)
//Updated application.properties

//todo ActiveMQ not starting

//https://www.youtube.com/results?search_query=spring+boot+camel


//https://github.com/apache/camel-spring-boot-examples/tree/main/activemq
//https://github.com/apache/camel-spring-boot-examples/tree/main/spring-boot
//https://github.com/JoseLuisSR/springboot-activemq/tree/master/publish-and-subscribe


//https://camel.apache.org/camel-spring-boot/3.13.x/
// https://camel.apache.org/components/3.13.x/activemq-component.html
//https://camel.apache.org/manual/routes.html
//https://camel.apache.org/manual/component.html
    //https://camel.apache.org/camel-spring-boot/3.13.x/list.html


    //https://examples.javacodegeeks.com/enterprise-java/apache-camel/apache-camel-components/
    //https://www.codeusingjava.com/camel/camel-intro
    //https://dzone.com/articles/spring-boot-microservices-apache-camel-hello-world


//    /**
//     * Expose ActiveMQ through a broker if needed to be shared on the network
//     *
//     */
//    @Bean
//    public BrokerService broker() throws Exception {
//        BrokerService brokerService = new BrokerService();
//        brokerService.addConnector("tcp://localhost:61616");
//        brokerService.setPersistent(false);
//        //brokerService.setDestinationPolicy(policyMap());
//        return brokerService;
//    }
}