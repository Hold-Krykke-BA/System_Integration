package holdkrykke.bookservice.services.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "saleregisteredcaching", groupId = "salegroup")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
        //Parse message to Order
        //Update DB on ID and decrement quantity by 1
    }

}
