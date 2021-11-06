package holdkrykke.client.producer;

import holdkrykke.client.model.Customer;
import holdkrykke.client.model.LoanApplicant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//Taken from Producer3: https://github.com/datsoftlyngby/soft2021fall-SI/blob/main/code/p9-Kafka/P9-Kafka-Producer-3/src/main/java/dk/dd/kafkaproducer3/producer/ProducerService.java

@Service
public class ProducerService {

    @Value("${spring.kafka.producer.topic}") //This points to application.yml
    String topic;
    private static Logger logger = LoggerFactory.getLogger(ProducerService.class);

    @Autowired // Ignore the compiler's warning
//    private KafkaTemplate<String, Object> template;
    private KafkaTemplate<String, Object> template;

//      public void sendObject(Customer customer)
    public void sendObject(LoanApplicant loanapplicant) {
        template.send(topic, new LoanApplicant(loanapplicant.getSsn(), loanapplicant.getCreditScore(), loanapplicant.getLoanAmount(),
                loanapplicant.getCurrentDebt(), loanapplicant.getYearlySalary(), loanapplicant.getLoanType()));
        logger.info("### Producer sends customer [{}:{}:{}:{}:{}:{}]", loanapplicant.getSsn(), loanapplicant.getCreditScore(), loanapplicant.getLoanAmount(),
                loanapplicant.getCurrentDebt(), loanapplicant.getYearlySalary(), loanapplicant.getLoanType());
        template.flush();
//        template.send(topic, new Customer(customer.getId(), customer.getName()));
//        logger.info("### Producer sends customer [{}:{}]", customer.getId(), customer.getName());
//        template.flush();
    }

}
