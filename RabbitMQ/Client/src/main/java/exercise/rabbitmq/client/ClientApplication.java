package exercise.rabbitmq.client;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class ClientApplication {

    private final static String QUEUENAME = "TODO"; //TODO
    private final static String HOST = "localhost";
    private final static int PORT = -1;

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);

        //This needs to act as a producer...and a consumer, as it needs to chose from the returned answers

        //Set up parameters
        String topic = "bank.todo"; //TODO
        Long amount = -1L; //TODO
        int years = -1; //TODO
        int creditScore = -1; //TODO

        //Connect to broker, channel.
        //Connect to queue (single search?) or topic (multisearch?) -- probably only one, probably topic?
        //Await response (How long? How many clients to expect?)
        //Chose from responders

        clientApplication(topic, amount, years, creditScore);
    }

    private static void clientApplication(String topic, Long amount, int years, int creditScore) {
        //Copy paste in-class consumer for now

        // 1. Create factory
        ConnectionFactory cf = new ConnectionFactory();
        cf.setHost(HOST); //port defaults to 5672 (see getPort())

        try {
            // 2. Create connection from factory instance
            Connection con = cf.newConnection();

            // 3. Create channel from connection instance
            Channel channel = con.createChannel();

            // 4. Create queue from channel instance
            channel.queueDeclare(QUEUENAME, false, false, false, null); //TODO (download documentation from maven too!)

            // 5. Send message
            //TODO need to figure out how we publish properly. See Resources in README.
            //channel.basicPublish("", QUEUENAME, null, message);

            //6. Await response? //TODO
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }
    }


}
