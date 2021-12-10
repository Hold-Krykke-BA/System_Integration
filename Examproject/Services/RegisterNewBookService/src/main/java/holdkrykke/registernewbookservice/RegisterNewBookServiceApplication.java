package holdkrykke.registernewbookservice;

import holdkrykke.Exceptions.ISBNValidationException;
import holdkrykke.registernewbookservice.services.soap.ISBNValidationClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegisterNewBookServiceApplication {

    public static void main(String[] args) throws ISBNValidationException {
        SpringApplication.run(RegisterNewBookServiceApplication.class, args);
//        var uno = ISBNValidationClient.getInstance().validateISBN("87-01-32671-6");
//        var dos = ISBNValidationClient.getInstance().validateISBN("87-01-32671-6");
//        var tres = ISBNValidationClient.getInstance().validateISBN("NotAnISBN");
//
//        System.out.println("should be true: " + uno);
//        System.out.println("should be true: " + dos);
//        System.out.println("should be false: " + tres);
    }

}
