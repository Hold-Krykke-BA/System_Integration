package holdkrykke.registersaleservice.controllers;
import com.mongodb.MongoException;
import holdkrykke.registersaleservice.models.Order;
import holdkrykke.registersaleservice.repositories.OrderRepository;
import holdkrykke.registersaleservice.services.kafka.ProducerService;
import holdkrykke.registersaleservice.services.kafka.ProducerServiceCallBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Value("${kafka.topic.requestreply-topic}")
@RestController
@RequestMapping("/kafka")
public class KafkaOrderController
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

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("")
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    @PostMapping("/register")
    public Order createOrder(@RequestBody Order order) {
        try {
            Order saved = orderRepository.save(order);
            service.sendMessage(saved.toString());
            return saved;
        } catch (MongoException ex) {
            // throw custom exception
            throw ex;
        }
    }


}
