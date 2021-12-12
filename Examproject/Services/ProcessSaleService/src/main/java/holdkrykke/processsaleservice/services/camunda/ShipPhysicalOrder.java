package holdkrykke.processsaleservice.services.camunda;

import com.mongodb.MongoException;
import holdkrykke.processsaleservice.models.Order;
import holdkrykke.processsaleservice.repositories.OrderRepository;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ShipPhysicalOrder implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("");

    @Autowired
    private OrderRepository orderRepository;

    public void execute(DelegateExecution execution) throws Exception {
        Order order = (Order) execution.getVariable("order");
        System.out.println("SHIPPING PHYSICAL " + order);
        try {
            Order _order = orderRepository.findByOrderNumber(order.getOrderNumber());
            _order.setOrderStatus("shipped");
            orderRepository.save(_order);
            System.out.println("New order status: " + orderRepository.findByOrderNumber(_order.getOrderNumber()));

        } catch (MongoException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
