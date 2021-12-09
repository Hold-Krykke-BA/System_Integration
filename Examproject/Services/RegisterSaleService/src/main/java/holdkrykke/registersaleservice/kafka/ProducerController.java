package holdkrykke.registersaleservice.kafka;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Value("${kafka.topic.requestreply-topic}")
    @RestController
    @RequestMapping("/kafka")
    public class ProducerController
    {
        @Value("${topic.name.producer}")
        String topic;

        //private static Logger logger = LoggerFactory.getLogger(ProducerService.class);

        @Autowired
        private ProducerService service;

        @PostMapping(value = "/customer")
        public String sendMyObject(@RequestBody String customer)
        {
            service.sendObject(customer);
            return "Customer published: " + customer ;
        }
    }
