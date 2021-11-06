package holdkrykke.client.producer;

import holdkrykke.client.model.Customer;
import holdkrykke.client.model.LoanApplicant;
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

//    @PostMapping(value = "/customer")
    @PostMapping(value = "/loan")
    public String sendMyObject(@RequestBody LoanApplicant loanapplicant) {
        service.sendObject(loanapplicant);
        return "LoanApplicant published: " + loanapplicant.getSsn() + " : " + loanapplicant.getCreditScore() + " : " + loanapplicant.getLoanAmount() + " : " +
                loanapplicant.getCurrentDebt() + " : " +loanapplicant.getYearlySalary() + " : " +loanapplicant.getLoanType() + " " + topic;
//        service.sendObject(customer);
//        return "Customer published: " + customer.getId() + " : " + customer.getName() + " " + topic;
    }
}
