package holdkrykke.registersaleservice.controllers;
import com.mongodb.MongoException;
import holdkrykke.registersaleservice.exceptions.RegisterSaleException;
import holdkrykke.registersaleservice.models.Order;
import holdkrykke.registersaleservice.models.OrderItem;
import holdkrykke.registersaleservice.models.OrderNumberDTO;
import holdkrykke.registersaleservice.repositories.OrderRepository;
import holdkrykke.registersaleservice.services.kafka.ProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/kafka")
public class KafkaOrderController {
    private static final Logger logger = LoggerFactory.getLogger(KafkaOrderController.class);

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
    public List<Order> createOrder(@RequestBody Order order) throws RegisterSaleException {
        try {
            List<Order> orderList = checkOrder(order);
            List<Order> savedOrderList = new ArrayList<>();
            for(Order _order: orderList){
                Order saved = orderRepository.save(_order);
                savedOrderList.add(saved);
                service.sendSaleRegistered(processingTopic, new OrderNumberDTO(saved));
                service.sendSaleRegistered(cachingTopic, saved);
            }
            return savedOrderList;
        } catch (MongoException ex) {
            logger.error("/register: MongoException caught [{}]", ex.getMessage());
            throw new RegisterSaleException(ex.getMessage());
        }
    }

    private List<Order> checkOrder(Order order) throws RegisterSaleException {
        List<Order> orderList = new ArrayList<>();
        List<OrderItem> itemsDigital = new ArrayList<>();
        List<OrderItem> itemsPhysical = new ArrayList<>();

        for(OrderItem item : order.getOrderItems()){
            if (item.getType().equals("ebook") || item.getType().equals("audiobook")){
                itemsDigital.add(item);
            }
            else{
                itemsPhysical.add(item);
            }
        }
        if (!itemsDigital.isEmpty() && !itemsPhysical.isEmpty()) {
            Order orderDigital = new Order(order);
            orderDigital.setOrderItems(itemsDigital);
            orderDigital.setOrderType(getOrderType(itemsDigital));
            orderDigital.setOrderNumber(order.getOrderNumber()+"a");
            orderList.add(orderDigital);

            Order orderPhysical = new Order(order);
            orderPhysical.setOrderNumber(order.getOrderNumber()+"b");
            orderPhysical.setOrderType(getOrderType(itemsPhysical));
            orderPhysical.setOrderItems(itemsPhysical);
            orderList.add(orderPhysical);
        }else{
            order.setOrderType(getOrderType(order.getOrderItems()));
            orderList.add(order);
        }
        updateOrderPrice(orderList);
        return orderList;
    }

    private String getOrderType(List<OrderItem> items) throws RegisterSaleException {
        boolean ebook = false;
        boolean audiobook = false;
        boolean book = false;

        for(OrderItem item : items){
            if (item.getType().equals("ebook")) ebook = true;
            if (item.getType().equals("audiobook")) audiobook = true;
            if (item.getType().equals("book")) book = true;
        }
        if (book) return "book";
        if (audiobook && ebook) return "ebook/audiobook";
        if (audiobook) return "audiobook";
        if (ebook) return "ebook";

        throw new RegisterSaleException("OrderItem.getType() not valid");
    }

    private void updateOrderPrice(List<Order> orderList) {
        for (Order order : orderList){
            Double temp = 0.0;
            for(OrderItem item : order.getOrderItems()){
                temp = temp + item.getPrice();
            }
            order.setTotalPrice(temp);
        }
    }



}
