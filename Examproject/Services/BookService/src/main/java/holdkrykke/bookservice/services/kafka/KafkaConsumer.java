package holdkrykke.bookservice.services.kafka;

import holdkrykke.bookservice.models.Book;
import holdkrykke.bookservice.models.Order;
import holdkrykke.bookservice.models.OrderItem;
import holdkrykke.bookservice.repositories.BookStoreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


@Service
public class KafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
    @Autowired
    private BookStoreRepository repo;

    @KafkaListener(topics = "saleregisteredcaching", groupId = "salegroup")
    public void consume(GenericMessage<Order> orderMessage) {
        logger.info("Kafka Consumed message: [{}]", orderMessage);
        Order order = orderMessage.getPayload();

        Map<OrderItem, Long> ordersAndAmounts =
                order.getOrderItems().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        ordersAndAmounts.forEach((item, count) -> {
            logger.info("Purchased amount: [{}]", count);
            Book book = repo.findByIsbn(item.getIsbn());
            book.setQuantity(book.getQuantity() - count.intValue());
            logger.info("Current quantity remaining: [{}]", book.getQuantity());
            repo.save(book);
        });
    }
}
