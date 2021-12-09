package holdkrykke.registersaleservice.kafka;

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
    private KafkaTemplate<String, Object> template;

    public void sendObject(String customer)
    {
        template.send(topic, customer);
        logger.info("### Producer sends customer [{}:{}]", customer);
        template.flush();
    }
}
