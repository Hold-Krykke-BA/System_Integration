package exercise.rabbitmq.client;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

@SpringBootApplication
public class ClientApplication {

    private static final String EXCHANGE_NAME = "topic_banks";
    private static final String RPC_QUEUE_NAME = "rpc_queue_banks";
    private final static String HOST = "localhost";
    private static ArrayList<String> results = new ArrayList();

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

            //Prepare publish request
            final String corrId = UUID.randomUUID().toString();
            String replyQueueName = channel.queueDeclare(RPC_QUEUE_NAME,false,false,false,null).getQueue();
            AMQP.BasicProperties props = new AMQP.BasicProperties
                    .Builder()
                    .correlationId(corrId)
                    .replyTo(replyQueueName)
                    .build();

            //Publish message to exchange
            channel.basicPublish(EXCHANGE_NAME, routingKey, props, message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] Sent '" + routingKey + "':'" + message + "'");

            //Prepare structure for consume
            final BlockingQueue<String> response = new ArrayBlockingQueue<>(1);
            //Consume responses
            String ctag = channel.basicConsume(replyQueueName, true, (consumerTag, delivery) -> {
                System.out.println("  [.] Received a new response: " + new String(delivery.getBody(), "UTF-8"));
                if (delivery.getProperties().getCorrelationId().equals(corrId)) {
                    response.offer(new String(delivery.getBody(), "UTF-8"));
                }
            }, consumerTag -> {
            });

            String result = response.take();
            System.out.println(" [.] Received correct response: " + result);
            handleResults(result);
            channel.basicCancel(ctag);
        }

    }

    private static void handleResults(String result) {
        results.add(result);

        if (results.size() >= 3) {
            var filteredResults = results.stream().filter(res -> !res.contains("[§Denied]")); //filter out denied responses
            var finalResult = filteredResults.findAny().toString();

            System.out.println("Final loan result chosen:");
            System.out.println(finalResult);
            results.clear(); //cleanup for future
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
