package holdkrykke.processsaleservice.services.kafka;

import holdkrykke.processsaleservice.models.Order;
import holdkrykke.processsaleservice.repositories.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ConsumerService {
    @Autowired
    private OrderRepository orderRepository;

    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "saleregistered", groupId = "salegroup")
    public void consume(String message) throws IOException
    {
        System.out.println("Consumed message:" + message);
        List<Order> retrieved = orderRepository.findAll();
        for(Order order: retrieved){
            System.out.println(order.toString());
        }

        //logger.info("&&& Message [{}] consumed", message);
    }
}