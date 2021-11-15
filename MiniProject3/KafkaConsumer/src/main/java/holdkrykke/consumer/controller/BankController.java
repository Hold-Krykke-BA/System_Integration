package holdkrykke.consumer.controller;

import holdkrykke.consumer.exceptions.LoanNotFoundException;
import holdkrykke.consumer.model.Loan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Hosted at localhost<server.port>, i.e. localhost:9004
 */
@RestController
public class BankController {

    //How do we tie the applicationID to this application only?
    //Add host & port to response?
    @GetMapping(path = {"/loan/{applicationID}"}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Loan acceptLoan(@PathVariable String applicationID) {
        System.out.println(applicationID);

        //Get or create loan
        //Where are the loans stored? Retrieve
        Loan loan = new Loan();

        //If loan doesn't exist, return error message with 404 NOT FOUND
        if (loan == null) throw new LoanNotFoundException("No loan was found with ID: #" + applicationID);
        //...

        return loan;
    }


}

