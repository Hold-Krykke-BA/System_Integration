package exercise.rabbitmq.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.SerializationUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class ClientApplication {

    private static final String EXCHANGE_NAME = "topic_banks";
    private final static String HOST = "localhost";

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ClientApplication.class, args);

        //Set up connection
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(HOST);

        //Connect
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {

            channel.exchangeDeclare(EXCHANGE_NAME, "topic");

            //Get params
            String routingKey = getRouting(args);
            Long amount = getAmount(args);
            int years = getYears(args);
            int creditScore = getCreditScore(args);

            //Convert to "csv" format
            var message = amount + "," + years + "," + creditScore;
            System.out.println("Setup: " + message);

            //Publish message to exchange
            channel.basicPublish(EXCHANGE_NAME, routingKey, null, message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] Sent '" + routingKey + "':'" + message + "'");
        }

    }

    private static String getRouting(String[] args) {
        if (args.length < 1)
            return "banks.house";
        return "banks" + args[0]; //banks.car or banks.house
    }

    private static Long getAmount(String[] args) {
        if (args.length < 2)
            return 100000L;
        return Long.parseLong(args[1]);
    }

    private static int getYears(String[] args) {
        if (args.length < 3)
            return 10;
        return Integer.parseInt(args[2]);
    }

    private static int getCreditScore(String[] args) {
        if (args.length < 4)
            return 600;
        return Integer.parseInt(args[3]);
    }

}

class ClientDTO implements Serializable {
    private Long amount;
    private int years, creditScore;

    public ClientDTO() {
    }

    public ClientDTO(Long amount, int years, int creditScore) {
        this.amount = amount;
        this.years = years;
        this.creditScore = creditScore;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "amount=" + amount +
                ", years=" + years +
                ", creditScore=" + creditScore +
                '}';
    }
}
