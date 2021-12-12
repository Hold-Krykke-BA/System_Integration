package holdkrykke.processsaleservice.services.camunda;

import com.mongodb.MongoException;
import holdkrykke.processsaleservice.models.Order;
import holdkrykke.processsaleservice.repositories.OrderRepository;
import holdkrykke.processsaleservice.services.mail.MailService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ProcessDigitalOrder implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("");
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private MailService mailService;

    public void execute(DelegateExecution execution) throws Exception {
        Order order = (Order) execution.getVariable("order");
        System.out.println("PROCESSING DIGITAL " + order);
        try {
            Order _order = orderRepository.findByOrderNumber(order.getOrderNumber());
            _order.setOrderStatus("shipped");
            orderRepository.save(_order);
            Order updatedOrder = orderRepository.findByOrderNumber(_order.getOrderNumber());
            System.out.println("New order status: " + updatedOrder);
            mailService.sendEmail(updatedOrder.getCustomerMail(), "Order shipping information: " + updatedOrder.getOrderNumber(),
                    mailService.createBody(updatedOrder));
        } catch (MongoException ex) {
            System.out.println(ex.getMessage());
        }
    }
}