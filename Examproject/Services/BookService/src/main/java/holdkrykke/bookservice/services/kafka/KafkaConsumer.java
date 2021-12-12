package holdkrykke.bookservice.services.kafka;


import holdkrykke.bookservice.repositories.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {

    @Autowired
    private BookStoreRepository repo;

    @KafkaListener(topics = "saleregisteredcaching", groupId = "salegroup")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
        //Parse message to Order
        //Update DB on ID and decrement quantity by 1
//        Book book = repo.findById("").get();
//        book.setQuantity(book.getQuantity()-1);
//        repo.save(book);
    }

}
