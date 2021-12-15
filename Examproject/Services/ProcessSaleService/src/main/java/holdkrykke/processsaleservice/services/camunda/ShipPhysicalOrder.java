package holdkrykke.processsaleservice.services.camunda;

import com.mongodb.MongoException;
import holdkrykke.processsaleservice.exceptions.ProcessSaleException;
import holdkrykke.processsaleservice.models.Order;
import holdkrykke.processsaleservice.repositories.OrderRepository;
import holdkrykke.processsaleservice.services.mail.MailService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipPhysicalOrder implements JavaDelegate {
    private static final Logger logger = LoggerFactory.getLogger(ShipPhysicalOrder.class);

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private MailService mailService;

    public void execute(DelegateExecution execution) throws Exception {
        Order order = (Order) execution.getVariable("order");
        logger.info("Shipping physical order [{}]", order);
        try {
            Order _order = orderRepository.findByOrderNumber(order.getOrderNumber());
            _order.setOrderStatus("shipped");
            orderRepository.save(_order);
            Order updatedOrder = orderRepository.findByOrderNumber(_order.getOrderNumber());
            logger.info("Physical order, orderStatus changed [{}]", updatedOrder.getOrderStatus());
            logger.info("Preparing order-information-mail for order number [{}]", updatedOrder.getOrderNumber());
            mailService.sendEmail(updatedOrder.getCustomerMail(), "Order shipping information: " + updatedOrder.getOrderNumber(),
                    mailService.createBody(updatedOrder));
        } catch (MongoException ex) {
            logger.error("Processing MongoException caught [{}]", ex.getMessage());
            throw new ProcessSaleException(ex.getMessage());
        }
    }
}
