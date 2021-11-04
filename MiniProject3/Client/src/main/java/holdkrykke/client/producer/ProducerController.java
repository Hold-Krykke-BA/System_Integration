package holdkrykke.client.producer;

import holdkrykke.client.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Taken from Producer3: https://github.com/datsoftlyngby/soft2021fall-SI/blob/main/code/p9-Kafka/P9-Kafka-Producer-3/src/main/java/dk/dd/kafkaproducer3/producer/ProducerController.java

@RestController
@RequestMapping("/kafka")
public class ProducerController {

    @Value("${spring.kafka.producer.topic}") //This points to application.yml
    String topic;

    private static Logger logger = LoggerFactory.getLogger(ProducerService.class);

    @Autowired
    private ProducerService service;

    @PostMapping(value = "/customer")
    public String sendMyObject(@RequestBody Customer customer)
    {
        service.sendObject(customer);
        return "Customer published: " + customer.getId() + ":" + customer.getName() ;
    }
}
