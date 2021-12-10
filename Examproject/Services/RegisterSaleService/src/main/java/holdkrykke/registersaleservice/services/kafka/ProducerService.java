package holdkrykke.registersaleservice.services.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService
{
    @Value("${topic.name.producer}")
    String topic;
    private static Logger logger = LoggerFactory.getLogger(ProducerService.class);

    @Autowired
    // Ignore the compiler's warning
    private KafkaTemplate<String, String> template;

    public void sendMessage(String message)
    {

        template.send(topic, message);
        // logger.info(String.format("### -> Producer sends message -> %s", message));
        logger.info("### Producer sends message [{}]", message);
        template.flush();
    }
}
