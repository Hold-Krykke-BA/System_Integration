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


@RestController
@RequestMapping("/kafka")
public class KafkaOrderController {

    @Autowired
    private ProducerService service;

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
