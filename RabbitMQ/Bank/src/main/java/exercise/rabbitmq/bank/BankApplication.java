package exercise.rabbitmq.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

    private final static String QUEUENAME = "TODO";
    private final static String TOPICS = "TODO.TODO";
    private final static String HOST = "localhost";
    private final static int PORT = -1;


    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);

        //This should act as a consumer...and also a producer, as it needs to return a response
        //Consume on a common queue that banks connect to and filter in app (probably bad practice) or on headers
        //OR
        //Consume on a topic. Example: "bank.car.house.apartment" or "bank.all" or "bank.
        //OR
        //Consume everything and match on headers

        //Calculate loan if fit requirements:
        //Year, Amount, CreditRating

        //Return answer - Several ways to do this.

        loanApplication();
    }

    private static void loanApplication() {
        throw new UnsupportedOperationException("TODO");
    }

}
