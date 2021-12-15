package holdkrykke.bookservice.controllers;

import holdkrykke.Exceptions.ISBNValidationException;
import holdkrykke.bookservice.models.ISBNdto;
import holdkrykke.bookservice.services.soap.ISBNValidationClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import javax.ws.rs.Produces;

@RestController
@RequestMapping("/isbn")
public class ISBNValidationController {
    private static final Logger logger = LoggerFactory.getLogger(ISBNValidationController.class);

    @Autowired
    ISBNValidationClient client;

    @GetMapping("/{ISBN}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ISBNdto validateISBN(@PathVariable("ISBN") String ISBN) {
        logger.info("Validating ISBN [{}]", ISBN);
        try {
            boolean validity = client.validateISBN(ISBN);
            logger.info("ISBN validated [{}]", validity);
            return new ISBNdto(ISBN, validity);
        } catch (ISBNValidationException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
}
