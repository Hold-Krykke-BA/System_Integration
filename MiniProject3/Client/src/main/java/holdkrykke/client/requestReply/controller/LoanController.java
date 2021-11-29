package holdkrykke.client.requestReply.controller;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

import holdkrykke.client.model.LoanApplicant;
import holdkrykke.client.model.LoanApplicantOutDTO;
import org.apache.camel.ProducerTemplate;
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
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
public class LoanController {

    @Autowired
    private ProducerTemplate producerTemplate;

    @Autowired
    ReplyingKafkaTemplate<String, LoanApplicant, LoanApplicant> kafkaTemplate;

    @Value("${kafka.topic.request-topic}")
    String requestTopic;

    @Value("${kafka.topic.requestreply-topic}")
    String requestReplyTopic;

    @ResponseBody
    @PostMapping(value = "/loanapplication", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
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
        //sendResult.getProducerRecord().headers().forEach(header -> System.out.println(header.key() + ":" + Arrays.toString(header.value())));
        // get consumer record
        ConsumerRecord<String, LoanApplicant> consumerRecord = sendAndReceive.get();

        ArrayList<LoanApplicantOutDTO> results = new ArrayList<>();
        results.add(new LoanApplicantOutDTO(consumerRecord.value()));
        for (LoanApplicantOutDTO dto : results) {
            handleLoanResponse(dto);
        }
        return new LoanApplicantOutDTO(consumerRecord.value());
    }


    private void handleLoanResponse(LoanApplicantOutDTO dto) {

        System.out.println("DTO printed in handleLoanResponse: " + dto.toString());

        JsonSerializer parser = new JsonSerializer();
        var dtoJson = new String(parser.serialize("", dto), StandardCharsets.UTF_8);

//        System.out.println("DTO to json:" + dtoJson);
        if (dto.isBankAccept()) {
            producerTemplate.sendBody(String.format("file:src/main/resources/loans/accepted?fileName=%s.json", dto.getApplicationID()), dtoJson);
        } else {
            producerTemplate.sendBody(String.format("file:src/main/resources/loans/rejected?fileName=%s.json", dto.getApplicationID()), dtoJson);
        }
        producerTemplate.sendBody(String.format("file:src/main/resources/loans/all?fileName=%s.json", dto.getApplicationID()), dtoJson);
    }


    /**
     * Accept loan at external bank
     *
     * @param
     * @return
     */
    @GetMapping(path = {"/loan/{applicationID}"})
    public void acceptLoanFromBank(String applicationID) {
        //todo Return type should be LoanDTO
        //Accept this loan in question
        //How do we know which bank to target? Should this be included in the bank response, and the request should be sent to here?

        //call external bank
        final String uri = "http://localhost:9004/loan/" + applicationID;
        RestTemplate template = new RestTemplate(); //this is old but we need to install SpringReactiveWeb for modern "WebClient" https://stackoverflow.com/questions/42365266/call-another-rest-api-from-my-server-in-spring-boot

        //get response
        String result = template.getForObject(uri, String.class); //should be a json object

        //serve response
        System.out.println(result);
    }

}