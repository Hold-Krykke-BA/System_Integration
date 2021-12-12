package holdkrykke.processsaleservice.services.kafka;

import holdkrykke.processsaleservice.models.Order;
import holdkrykke.processsaleservice.repositories.OrderRepository;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.variable.Variables;
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

    @Autowired
    private RuntimeService runtimeService;

    @KafkaListener(topics = "saleregistered", groupId = "salegroup")
    public void consume(String message) throws IOException {
        System.out.println("Consumed message:" + message);
        List<Order> retrieved = orderRepository.findByOrderStatus("registered");
        for(Order order: retrieved){
            System.out.println("Received order: " + order.getId() + ", with order status: " + order.getOrderStatus());
            runtimeService.startProcessInstanceByKey("orderProcessing",Variables.createVariables()
                    .putValueTyped("order", Variables.objectValue(order).serializationDataFormat(Variables.SerializationDataFormats.JSON).create())
                    .putValue("orderType", order.getOrderType())
            );
        }
    }
}