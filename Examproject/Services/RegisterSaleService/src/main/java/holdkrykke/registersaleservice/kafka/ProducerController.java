package holdkrykke.registersaleservice.kafka;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

//@Value("${kafka.topic.requestreply-topic}")
@RestController
@RequestMapping("/kafka")
public class ProducerController
{
    // Option 1:
    @Autowired
    private ProducerService service;

    @PostMapping(value = "/message/{message}")
    public String sendMyMessageToKafka(@PathVariable("message") String message)
    {
        service.sendMessage(message);
        return "Message published: " + message;
    }

    // Option 2: Sending message with an async callback
    @Autowired
    private ProducerServiceCallBack serviceCallBack;

    @PostMapping(value = "/message/callback/{message}")
    public String sendMyMessageCallBack(@PathVariable("message") String message)
    {
        serviceCallBack.sendMessageCallBack(message);
        return "Message published: " + message;
    }
}
