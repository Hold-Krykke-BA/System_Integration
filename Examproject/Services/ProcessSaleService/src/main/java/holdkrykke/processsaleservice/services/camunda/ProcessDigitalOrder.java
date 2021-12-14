package holdkrykke.processsaleservice.services.camunda;

import com.mongodb.MongoException;
import holdkrykke.processsaleservice.models.Order;
import holdkrykke.processsaleservice.repositories.OrderRepository;
import holdkrykke.processsaleservice.services.kafka.ConsumerService;
import holdkrykke.processsaleservice.services.mail.MailService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessDigitalOrder implements JavaDelegate {

    private static final Logger logger = LoggerFactory.getLogger(ProcessDigitalOrder.class);
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private MailService mailService;

    public void execute(DelegateExecution execution) throws Exception {
        Order order = (Order) execution.getVariable("order");
        logger.info("Processing and shipping digital order [{}]", order);
        try {
            Order _order = orderRepository.findByOrderNumber(order.getOrderNumber());
            _order.setOrderStatus("shipped");
            orderRepository.save(_order);
            Order updatedOrder = orderRepository.findByOrderNumber(_order.getOrderNumber());
            logger.info("Digital order, orderStatus changed [{}]", updatedOrder.getOrderStatus());
            mailService.sendEmail(updatedOrder.getCustomerMail(), "Order shipping information: " + updatedOrder.getOrderNumber(),
                    mailService.createBody(updatedOrder));
        } catch (MongoException ex) {
            logger.error("Processing MongoException caught [{}]", ex.getMessage());
        }
    }
}