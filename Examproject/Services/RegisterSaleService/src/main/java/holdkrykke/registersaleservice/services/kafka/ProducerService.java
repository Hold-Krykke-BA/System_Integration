package holdkrykke.registersaleservice.services.kafka;

import holdkrykke.registersaleservice.models.Order;
import holdkrykke.registersaleservice.models.OrderNumberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    private static final Logger logger = LoggerFactory.getLogger(ProducerService.class);

    @Autowired
    private KafkaTemplate<String, Object> template;

    public void sendSaleRegistered(String topic, OrderNumberDTO message) {
        template.send(topic, message);
        logger.info("Producer sends on topic: {}, message: {}", topic, message);
        template.flush();
    }


    public void sendSaleRegistered(String topic, Order message) {

        template.send(topic, message);
        logger.info("Producer sends on topic: {}, message: {}", topic, message);
        template.flush();
    }

}

