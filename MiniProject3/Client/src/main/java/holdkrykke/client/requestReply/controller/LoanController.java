package holdkrykke.client.requestReply.controller;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

import holdkrykke.client.model.LoanApplicant;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;
import org.springframework.kafka.requestreply.RequestReplyFuture;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
public class LoanController {

    @Autowired
    ReplyingKafkaTemplate<String, LoanApplicant,LoanApplicant> kafkaTemplate;

    @Value("${kafka.topic.request-topic}")
    String requestTopic;

    @Value("${kafka.topic.requestreply-topic}")
    String requestReplyTopic;

    @ResponseBody
    @PostMapping(value="/sum",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public LoanApplicant sum(@RequestBody LoanApplicant request) throws InterruptedException, ExecutionException {
        // create producer record
        ProducerRecord<String, LoanApplicant> record = new ProducerRecord<String, LoanApplicant>(requestTopic, request);
        // set reply topic in header
        record.headers().add(new RecordHeader(KafkaHeaders.REPLY_TOPIC, requestReplyTopic.getBytes()));
        // post in kafka topic
        RequestReplyFuture<String, LoanApplicant, LoanApplicant> sendAndReceive = kafkaTemplate.sendAndReceive(record);

        // confirm if producer produced successfully
        SendResult<String, LoanApplicant> sendResult = sendAndReceive.getSendFuture().get();

        //print all headers
        sendResult.getProducerRecord().headers().forEach(header -> System.out.println(header.key() + ":" + Arrays.toString(header.value())));

        // get consumer record
        ConsumerRecord<String, LoanApplicant> consumerRecord = sendAndReceive.get();

        System.out.println(consumerRecord.value());
        // return consumer value
        return consumerRecord.value();
    }

    /**
     * Accept loan at
     * @param applicant
     * @return
     */
    @GetMapping(path = {"/loan/{applicationID}"})
    public void acceptLoanFromBank(String applicant) {
        //todo Return type should be LoanDTO
        //Accept this loan in question
        //How do we know which bank to target? Should this be included in the bank response, and the request should be sent to here?

        //call external bank
        final String uri = "http://localhost:9004";
        RestTemplate template = new RestTemplate(); //this is old but we need to install SpringReactiveWeb for modern "WebClient" https://stackoverflow.com/questions/42365266/call-another-rest-api-from-my-server-in-spring-boot

        //get response
        String result = template.getForObject(uri, String.class); //should be a json object

        //serve response
        System.out.println(result);
    }

}