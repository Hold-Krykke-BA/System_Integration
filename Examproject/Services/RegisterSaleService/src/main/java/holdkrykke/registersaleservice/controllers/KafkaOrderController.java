package holdkrykke.registersaleservice.controllers;
import com.mongodb.MongoException;
import holdkrykke.registersaleservice.models.Order;
import holdkrykke.registersaleservice.models.OrderItem;
import holdkrykke.registersaleservice.repositories.OrderRepository;
import holdkrykke.registersaleservice.services.kafka.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/kafka")
public class KafkaOrderController {

    @Autowired
    private ProducerService service;

    @Autowired
    private OrderRepository orderRepository;

    @Value("${topic.name.processing}")
    String processingTopic;

    @Value("${topic.name.caching}")
    String cachingTopic;

    @GetMapping("")
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    @PostMapping("/register")
    public List<Order> createOrder(@RequestBody Order order) {
        try {
            List<Order> orderList = checkOrder(order);
            List<Order> savedOrderList = new ArrayList<>();
            for(Order _order: orderList){
                Order saved = orderRepository.save(_order);
                savedOrderList.add(saved);
                service.sendSaleRegistered(processingTopic,saved.toString());
                service.sendSaleRegistered(cachingTopic,saved.toString());
            }
            return savedOrderList;
        } catch (MongoException ex) {
            // throw custom exception
            throw ex;
        }
    }

    private List<Order> checkOrder(Order order){
        System.out.println(order.getOrderItems().getClass());
        List<Order> orderList = new ArrayList<>();
        List<OrderItem> itemsDigital = new ArrayList<>();
        List<OrderItem> itemsPhysical = new ArrayList<>();

        for(OrderItem item : order.getOrderItems()){
            if (item.getIsDigital()){
                itemsDigital.add(item);
            }
            else{
                itemsPhysical.add(item);
            }
        }
        if (!itemsDigital.isEmpty() && !itemsPhysical.isEmpty()) {
            Order orderDigital = new Order(order);
            orderDigital.setOrderItems(itemsDigital);
            orderDigital.setOrderNumber(order.getOrderNumber()+"a");
            orderList.add(orderDigital);

            Order orderPhysical = new Order(order);
            orderPhysical.setOrderNumber(order.getOrderNumber()+"b");
            orderPhysical.setOrderItems(itemsPhysical);
            orderList.add(orderPhysical);
        }else{
            orderList.add(order);
        }
        return orderList;
    }

}
