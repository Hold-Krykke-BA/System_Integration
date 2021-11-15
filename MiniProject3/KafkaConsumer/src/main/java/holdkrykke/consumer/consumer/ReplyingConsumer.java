//package holdkrykke.consumer.consumer;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//@Service
//@Component
//public class ReplyingConsumer {
//    @KafkaListener(topics = "${kafka.topic.request-topic}")
//    @SendTo
//    public String listen(Object request) throws InterruptedException {
//        System.out.println(request);
//
//        //request.setAdditionalProperty("sum", sum);
//        return "HAT + " + request.toString();
//    }
//}
