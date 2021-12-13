package holdkrykke.bookservice.services.kafka;


import holdkrykke.bookservice.models.Book;
import holdkrykke.bookservice.models.Order;
import holdkrykke.bookservice.repositories.BookStoreRepository;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {

    @Autowired
    private BookStoreRepository repo;

    @KafkaListener(topics = "saleregisteredcaching", groupId = "salegroup" )
    public void consume( GenericMessage<Order> orderMessage) {
        System.out.println("Consumed message: " + orderMessage);
        System.out.println("Converted order: " + orderMessage.getPayload());
        System.out.println("Is the converted order actually an order?: " + (orderMessage.getPayload() instanceof Order));


        //Parse message to Order
        //Filtrer på ID ->
        //Update DB on ID, decrement by amount of ID hits
//        Book book = repo.findById("").get();
//        book.setQuantity(book.getQuantity() - 1);
//        repo.save(book);
    }

}
