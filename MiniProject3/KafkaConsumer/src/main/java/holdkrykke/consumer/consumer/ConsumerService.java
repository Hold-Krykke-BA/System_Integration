package holdkrykke.consumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;
import java.io.IOException;

//Taken from Consumer1: https://github.com/datsoftlyngby/soft2021fall-SI/blob/main/code/p9-Kafka/P9-Kafka-Consumer-1/src/main/java/dk/dd/kafkaconsumer1/consumer/ConsumerService.java
@Service
public class ConsumerService
{
    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

//    @KafkaListener(topics = "loan-application", groupId = "my-group")
//    public void consume(String message) throws IOException
//    {
//        System.out.println("Consumed message:" + message);
//        logger.info("&&& Message [{}] consumed", message);
//    }

    @KafkaListener(topics = "request-topic", groupId = "requestreplygorup")
    //@KafkaListener(topics = "${kafka.topic.request-topic}")
    //@KafkaListener(topics = "loan-application", groupId = "my-group")
    @SendTo
    public byte[] listen(LoanApplicant request) throws InterruptedException {
        System.out.println(request);
        request.setApplicationID("HAT-HATTER-HAT");
        //request.setAdditionalProperty("sum", sum);


        JsonSerializer<LoanApplicant> json = new JsonSerializer<LoanApplicant>();
        var response = json.serialize("requestreply-topic",request);
        System.out.println(response.toString());
        return response; // ???????
    }
}