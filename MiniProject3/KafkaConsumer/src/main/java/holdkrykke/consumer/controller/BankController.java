package holdkrykke.consumer.controller;

import holdkrykke.consumer.config.KafkaConfig;
import holdkrykke.consumer.consumer.LoanApplicant;
import holdkrykke.consumer.exceptions.LoanNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Hosted at localhost<server.port>, i.e. localhost:9004
 */
@RestController
public class BankController {


    @Autowired
    private ApplicationContext context;

    //Todo Tie the applicationID to this application only
    @GetMapping(path = {"/loan/{applicationID}"}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public LoanApplicant acceptLoan(@PathVariable String applicationID) {
        System.out.println("Application ID: " + applicationID);

        HashMap<String, LoanApplicant> loanContainer = (HashMap<String, LoanApplicant>) context.getBean("loans");
        LoanApplicant loan = loanContainer.get(applicationID);
        System.out.println("Loan tied to Application ID: " + loan);

        //If loan doesn't exist, return error message with 404 NOT FOUND
        if (loan == null) throw new LoanNotFoundException("No loan was found with ID: #" + applicationID);

        return loan;
    }


}

