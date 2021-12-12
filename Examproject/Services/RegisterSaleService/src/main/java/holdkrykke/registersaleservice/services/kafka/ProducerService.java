package holdkrykke.registersaleservice.services.kafka;

import holdkrykke.registersaleservice.models.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    private static final Logger logger = LoggerFactory.getLogger(ProducerService.class);

    @Autowired
    private KafkaTemplate<String, String> template;

    public void sendSaleRegisteredOnProcessingTopic(String topic, String message) {
        template.send(topic, message);
        logger.info("### Producer sends message [{}]", message);
        template.flush();
    }

}

