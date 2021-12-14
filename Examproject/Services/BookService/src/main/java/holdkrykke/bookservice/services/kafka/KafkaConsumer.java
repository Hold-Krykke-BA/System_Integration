package holdkrykke.bookservice.services.kafka;


import holdkrykke.bookservice.models.Book;
import holdkrykke.bookservice.models.Order;
import holdkrykke.bookservice.models.OrderItem;
import holdkrykke.bookservice.repositories.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


@Service
public class KafkaConsumer {

    @Autowired
    private BookStoreRepository repo;

    @KafkaListener(topics = "saleregisteredcaching", groupId = "salegroup")
    public void consume(GenericMessage<Order> orderMessage) {
        System.out.println("Kafka Consumed message: " + orderMessage);
        Order order = orderMessage.getPayload();

        //Consolidate equal books to gather amount sold
        Map<OrderItem, Long> ordersAndAmounts =
                order.getOrderItems().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        ordersAndAmounts.forEach((item, count) -> {
            System.out.println("Purchased amount: " + count);
            Book book = repo.findById(item.getIsbn()).get(); //get book
            System.out.println("Current quantity remaining: " + book.getQuantity());
            book.setQuantity(book.getQuantity() - count.intValue()); //replace book quantity by purchased amount
            repo.save(book);
        });
    }
}
