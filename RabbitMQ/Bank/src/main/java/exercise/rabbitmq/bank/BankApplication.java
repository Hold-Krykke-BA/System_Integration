package exercise.rabbitmq.bank;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class BankApplication {

    private static final String EXCHANGE_NAME = "topic_banks";
    private final static String HOST = "localhost";

    static long maxAmount = 1_000_000L;
    static long minAmount = 50_000L;
    static int maxYears = 30;
    static int minYears = 4;
    static int acceptableCreditScore = 600;
    static String bankId = UUID.randomUUID().toString();


    public static void main(String[] args) throws Exception {
        SpringApplication.run(BankApplication.class, args);

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "topic");
        String queueName = channel.queueDeclare().getQueue();

        if (args.length < 1) {
            System.err.println("Usage: [binding_key]. Example: banks.house || banks.* || #");
            System.err.println("[min_amount] [max_amount] [min_years] [max_years] [acceptable_credit_score]");
            //System.exit(1);
        }

        //Set up parameters
        String keys = "#"; //Default, get all messages
        if (args.length > 0) {
            keys = args[0];
        }

        if (args.length > 1) {
            minAmount = Long.parseLong(args[1]);
        }

        if (args.length > 2) {
            maxAmount = Long.parseLong(args[2]);
        }

        if (args.length > 3) {
            minYears = Integer.parseInt(args[3]);
        }

        if (args.length > 4) {
            maxYears = Integer.parseInt(args[4]);
        }

        if (args.length > 5) {
            acceptableCreditScore = Integer.parseInt(args[5]);
        }

        channel.queueBind(queueName, EXCHANGE_NAME, keys);
        System.out.println("Bound queue: " + queueName + "\t" + EXCHANGE_NAME + "\t" + keys);

        System.out.println("Setup:\n" + minAmount + "\n" + maxAmount + "\n" + minYears + "\n" + maxYears + "\n" + acceptableCreditScore);
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");


        //Add tutorial6 to return call in bank & client
        //Handle return in client


        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = (new String(delivery.getBody(), "UTF-8"));
            System.out.println(" [x] Received '" + delivery.getEnvelope().getRoutingKey() + "':'" + message + "'");
            //Convert each unit back from String
            var data = message.toString().split(",");
            Long amount = Long.parseLong(data[0]);
            int years = Integer.parseInt(data[1]);
            int creditScore = Integer.parseInt(data[2]);

            String result = loanApplication(amount, years, creditScore);
            System.out.println(result);
        };

        channel.basicConsume(queueName, true, deliverCallback, consumerTag -> {
        });

    }

    private static String loanApplication(Long amount, int years, int creditScore) {
        System.out.println("Loan application received:\n" + amount + "\n" + years + "\n" + creditScore);

        String response = "Bank ID: #" + bankId + ". ";
        boolean amountOK = false;
        boolean yearsOK = false;

        if (creditScore < acceptableCreditScore) {
            return response += "Loan not accepted."; //No way this loan goes through
        }
        response += "Credit score OK. ";

        if (amount >= minAmount && amount <= maxAmount) {
            response += "Amount OK. ";
            amountOK = true;
        }
        if (years >= minYears && years <= maxYears) {
            response += "Years OK. ";
            yearsOK = true;
        }

        if (amountOK && yearsOK) {
            response += "Everything OK. Loan possible.";
        } else {
            response += "Not everything is OK. Loan may not be possible";
        }
        return response;
    }
}