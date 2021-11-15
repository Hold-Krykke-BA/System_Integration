package holdkrykke.client.requestReply.controller;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import holdkrykke.client.model.LoanApplicant;
import holdkrykke.client.model.LoanApplicantOutDTO;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LoanController {

    @Autowired
    ReplyingKafkaTemplate<String, LoanApplicant,LoanApplicant> kafkaTemplate;

    @Value("${kafka.topic.request-topic}")
    String requestTopic;

    @Value("${kafka.topic.requestreply-topic}")
    String requestReplyTopic;

    @ResponseBody
    @PostMapping(value="/loanapplication",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public LoanApplicantOutDTO loanapplication(@RequestBody LoanApplicant request) throws InterruptedException, ExecutionException {
        // create producer record
        ProducerRecord<String, LoanApplicant> record = new ProducerRecord<String, LoanApplicant>(requestTopic, request);
        // set reply topic in header
        record.headers().add(new RecordHeader(KafkaHeaders.REPLY_TOPIC, requestReplyTopic.getBytes()));
        // post in kafka topic
        RequestReplyFuture<String, LoanApplicant, LoanApplicant> sendAndReceive = kafkaTemplate.sendAndReceive(record, Duration.ofSeconds(1));
        // confirm if producer produced successfully
        SendResult<String, LoanApplicant> sendResult = sendAndReceive.getSendFuture().get();
        //print all headers
        sendResult.getProducerRecord().headers().forEach(header -> System.out.println(header.key() + ":" + Arrays.toString(header.value())));
        // get consumer record
        ConsumerRecord<String, LoanApplicant> consumerRecord = sendAndReceive.get();

        ArrayList<LoanApplicantOutDTO> results = new ArrayList<>();
        results.add(new LoanApplicantOutDTO(consumerRecord.value()));
        for (LoanApplicantOutDTO dto : results){
            System.out.println(dto.toString());
        }
        return new LoanApplicantOutDTO(consumerRecord.value());
    }

}