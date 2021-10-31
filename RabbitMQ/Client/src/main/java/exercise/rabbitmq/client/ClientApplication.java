package exercise.rabbitmq.client;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class ClientApplication {

    private final static String QUEUENAME = "RPC_QUEUE"; //TODO
    private final static String HOST = "localhost";
    private final static int PORT = -1;

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);

        //This needs to act as a producer...and a consumer, as it needs to chose from the returned answers

        //Set up parameters
        String topic = args[0]; //"house.car.all" //TODO
        Long amount = Long.parseLong(args[1]); //TODO
        int years = Integer.parseInt(args[2]); //TODO
        int creditScore = Integer.parseInt(args[3]); //TODO

        //Convert to object
        ClientDTO message = new ClientDTO(topic, amount, years, creditScore);

        //Connect to broker, channel.
        //Connect to queue (single search?) or topic (multisearch?) -- probably only one, probably topic?
        //Await response (How long? How many clients to expect?)
        //Chose from responders

        clientApplication(message);
    }


    private static void clientApplication(ClientDTO message) {
        //Copy paste in-class consumer for now

        // 1. Create factory
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(HOST); //port defaults to 5672 (see getPort())

        // (2, 3) Try-with connection & channel
        try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
            //Create correlationId to match on
            final String corrId = UUID.randomUUID().toString();

            String replyQueueName = channel.queueDeclare().getQueue();
            AMQP.BasicProperties props = new AMQP.BasicProperties.
                    Builder().
                    correlationId(corrId). //match on correlationId
                            replyTo(replyQueueName). //match on queue name
                            build();


            //Convert object to byte[]
            byte[] data = SerializationUtils.serialize(message);

            //Publish message
            channel.basicPublish("", QUEUENAME, props, data);


            final BlockingQueue<String> response = new ArrayBlockingQueue<>(3);

            String ctag = channel.basicConsume(replyQueueName, true, (consumerTag, delivery) -> {
                //match on correlationId
                if (delivery.getProperties().getCorrelationId().equals(corrId)) {
                    response.offer(new String(delivery.getBody(), "UTF-8"));
                }
            }, consumerTag -> {
            });

            System.out.println("Status update outside");

            List<String> results = new ArrayList<>();

            while (results.size() < 3) { //todo or time has passed
                var result = response.take();
                results.add(result);
                System.out.println(result);
            }


            chooseLoanOffer(results);

        } catch (IOException | TimeoutException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void chooseLoanOffer(List<String> results) {
        for (int i = 0; i < results.size(); i++) {
            System.out.println("Offer #" + i);
            System.out.println(results.get(i));
        }
        System.out.println("---------");
        System.out.println("Chosen offer: " + "Offer #1:\n" + results.get(0));
    }
}

class ClientDTO implements Serializable {

    String topic;
    Long amount;
    int years, creditScore;

    public ClientDTO() {
    }

    public ClientDTO(String topic, Long amount, int years, int creditScore) {
        this.topic = topic;
        this.amount = amount;
        this.years = years;
        this.creditScore = creditScore;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientDTO)) return false;
        ClientDTO clientDTO = (ClientDTO) o;
        return getYears() == clientDTO.getYears() && getCreditScore() == clientDTO.getCreditScore() && Objects.equals(getTopic(), clientDTO.getTopic()) && Objects.equals(getAmount(), clientDTO.getAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTopic(), getAmount(), getYears(), getCreditScore());
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "topic='" + topic + '\'' +
                ", amount=" + amount +
                ", years=" + years +
                ", creditScore=" + creditScore +
                '}';
    }
}
