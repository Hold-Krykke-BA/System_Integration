package holdkrykke.cacheservice.services.camel.routes;

import holdkrykke.cacheservice.repositories.redis.BookCacheRepository;
import org.apache.camel.CamelContext;
import org.apache.camel.Consume;
import org.apache.camel.Produce;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MainRoute extends RouteBuilder {

    @Autowired
    private GetCurrentTimeComponent getCurrentTimeBean;

    @Autowired
    private SimpleLoggingProcessingComponent loggingComponent;

//    @Autowired
//    private MyBean myBean;

    @Override
    public void configure() throws Exception {



//        from("mainroute:in")
//                .log(String.format("Camel MainRoute consumed a message with type [%d]", header("type")))
//                .choice()
//                .when(header("type").isEqualToIgnoreCase("external")).to("transform:external")
//                .when(header("type").isEqualToIgnoreCase("internal")).to("transform:internal")
//                .when(header("type").isEqualToIgnoreCase("cache")).to("transform:cache")
//                .end();

//        from("timer:second")
//                .bean(myBean, "doSomething")
//                .to("log:second");

        from("timer:first")
                //.transform().constant("Constant Message")
                .bean(getCurrentTimeBean, "getCurrentTime")
                .bean(loggingComponent)
//                .to("cache")
                .bean("myBean", "doSomething")
                .to("log:first");

    }
}


 interface MyListener {
    // this method is request/reply (InOut) because the method has a return value
    // to use one way (InOnly) then the method should be a void method
    String sayHello(String name);
}

@Component("myBean")
 class MyBean {
    @Produce(value = "cache")
    protected MyListener producer;

    @Bean
    public void doSomething() {
        // lets send a message and get a response back
        String response = producer.sayHello("James");
        System.out.println("Response here: " + response);
    }
}

@Component
 class Cache {

    @Bean
    @Consume(value = "cache")
    public String transform(String message) {
        System.out.println("msg: " + message);
        return "Transformed cache";
    }
}



@Component
class GetCurrentTimeComponent {

    //transforming, because it returns something (to the body)
    @Bean
    public String getCurrentTime() {
        return "Current time is: " + LocalDateTime.now();
    }
}

@Component
class SimpleLoggingProcessingComponent {

    private static final Logger logger = LoggerFactory.getLogger(SimpleLoggingProcessingComponent.class);

    //processing, because it is void
    public void processer(String message) {
        logger.info("[{}] consumed: [{}]", this.getClass(), message);
    }
}