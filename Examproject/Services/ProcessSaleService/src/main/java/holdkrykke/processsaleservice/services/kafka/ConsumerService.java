package holdkrykke.processsaleservice.services.kafka;

import holdkrykke.processsaleservice.models.Order;
import holdkrykke.processsaleservice.models.OrderNumberDTO;
import holdkrykke.processsaleservice.repositories.OrderRepository;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.variable.Variables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @Autowired
    private OrderRepository orderRepository;

    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    private RuntimeService runtimeService;

    @KafkaListener(topics = "saleregisteredprocessing", groupId = "salegroup")
    public void consume(GenericMessage<OrderNumberDTO>  message) {
        logger.info("Consumed message [{}]", message);
        Order retrievedOrder = orderRepository.findByOrderNumber(message.getPayload().getOrderNumber());
        logger.info("Retrieved Order [{}]", retrievedOrder);
        if (retrievedOrder.getOrderStatus().equals("registered")){
            logger.info("Started Camunda Process with order [{}]", retrievedOrder);
            runtimeService.startProcessInstanceByKey("orderProcessing",Variables.createVariables()
                    .putValueTyped("order", Variables.objectValue(retrievedOrder).serializationDataFormat(Variables.SerializationDataFormats.JSON).create())
                    .putValue("orderType", retrievedOrder.getOrderType())
            );
        }
    }
}