package holdkrykke.processsaleservice.services.kafka;

import holdkrykke.processsaleservice.models.Order;
import holdkrykke.processsaleservice.repositories.OrderRepository;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.variable.Variables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ConsumerService {
    @Autowired
    private OrderRepository orderRepository;

    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    private RuntimeService runtimeService;

    @KafkaListener(topics = "saleregistered", groupId = "salegroup")
    public void consume(String message) throws IOException
    {
        System.out.println("Consumed message:" + message);
        List<Order> retrieved = orderRepository.findAll();
        for(Order order: retrieved){
            System.out.println(order.getId());
            Map<String, Object> variables = new HashMap<String, Object>();
            variables.put("order", order);
            runtimeService.startProcessInstanceByKey("loanApproval",Variables.createVariables() //
                    .putValueTyped("order", Variables.objectValue(order).serializationDataFormat(Variables.SerializationDataFormats.JSON).create())
                    .putValue("orderType", order.getOrderType())
//                    .putValue(ProcessConstants.VAR_NAME_uiBaseUrl, uiBaseUrl)//
//                    .putValue(ProcessConstants.VAR_NAME_applicationNumber, application.getApplicationNumber())//
//                    .putValue(ProcessConstants.VAR_NAME_applicantName, application.getApplicant().getName())//
            );
        }


    }
}