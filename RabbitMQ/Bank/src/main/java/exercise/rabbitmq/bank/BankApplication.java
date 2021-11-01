package exercise.rabbitmq.bank;

import com.rabbitmq.client.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

@SpringBootApplication
public class BankApplication {

    private static final String EXCHANGE_NAME = "topic_banks";
    private static final String RPC_QUEUE_NAME = "rpc_queue_banks";
    private final static String HOST = "localhost";

    static long maxAmount = 1_000_000L;
    static long minAmount = 50_000L;
    static int maxYears = 30;
    static int minYears = 4;
    static int acceptableCreditScore = 600;
    static String bankId = UUID.randomUUID().toString();


    public static void main(String[] args) throws Exception {
        SpringApplication.run(BankApplication.class, args);

        //Check for args
        if (args.length < 1) {
            System.err.println("Usage: [binding_key]. Example: banks.house || banks.* || #");
            System.err.println("[min_amount] [max_amount] [min_years] [max_years] [acceptable_credit_score]");
            //System.exit(1); //Optional exit if we don't want default values to be used
        }

        //Set up parameters if exists in args, else use default
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

        //Prepare connection
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        //Connect
        try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
            //Setup exchange & queue
            channel.exchangeDeclare(EXCHANGE_NAME, "topic");

            String queueName = channel.queueDeclare(RPC_QUEUE_NAME,false,false,false,null).getQueue();
            //channel.queue
            //is queueName equal to RPC_QUEUE_NAME?
            System.out.println("RPC_QUEUE_NAME? " + RPC_QUEUE_NAME);
            System.out.println("queueName? " + queueName);

            //AMQP way to set the amount of messages to expect before continuing (1 is not suggested for production implementations)
            channel.basicQos(1);

            channel.queueBind(RPC_QUEUE_NAME, EXCHANGE_NAME, keys);
            System.out.println("Bound queue: " + queueName + "\t" + EXCHANGE_NAME + "\t" + keys);

            System.out.println("Setup:\n" + minAmount + "\n" + maxAmount + "\n" + minYears + "\n" + maxYears + "\n" + acceptableCreditScore);
            System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

            //Prepare monitoring for the RPC client (Has its own thread that we can .wait() and .notify() on)
            Object monitor = new Object(); //https://www.rabbitmq.com/monitoring.html

            //Setup callback for message consume and response
            DeliverCallback deliverCallback = (consumerTag, delivery) -> {

                //Prepare response
                String response = "";

                //Consume part
                try {
                    //Receive message
                    String receivedMessage = (new String(delivery.getBody(), "UTF-8"));
                    System.out.println(" [x] Received '" + delivery.getEnvelope().getRoutingKey() + "':'" + receivedMessage + "'");
                    //Convert each unit back from String
                    var data = receivedMessage.toString().split(",");
                    Long amount = Long.parseLong(data[0]);
                    int years = Integer.parseInt(data[1]);
                    int creditScore = Integer.parseInt(data[2]);

                    //Handle request internally
                    response += loanApplication(amount, years, creditScore);
                    System.out.println("Application response: " + response);
                } catch (Exception e) {
                    System.out.println("Error occurred when processing received message");
                    e.printStackTrace();
                } finally {
                    //Response part
                    //Return reply no matter success or failure

                    //Setup properties for the reply
                    AMQP.BasicProperties replyProps = new AMQP.BasicProperties
                            .Builder()
                            .correlationId(delivery.getProperties().getCorrelationId()) //Base reply on the correlationId received in request
                            .build();

                    channel.basicPublish(EXCHANGE_NAME, delivery.getProperties().getReplyTo(), replyProps, response.getBytes(StandardCharsets.UTF_8));
                    channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);

                    // RabbitMQ consumer worker thread notifies the RPC server owner thread
                    synchronized (monitor) {
                        monitor.notify();
                    }
                }
            };
            channel.basicConsume(RPC_QUEUE_NAME, true, deliverCallback, consumerTag -> {
            });
            // Wait and be prepared to consume the message from RPC client.
            while (true) {
                synchronized (monitor) {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        //Add tutorial6 to return call in bank & client
        //Handle return in client

        //They both send on the same queue and trigger themselves?
        //Bug may exist in publish <-> consume on queue vs routing key vs ???
        //what about the purge seen somewhere?

    }

    private static String loanApplication(Long amount, int years, int creditScore) {
        System.out.println("Loan application received:\n" + amount + "\n" + years + "\n" + creditScore);

        String response = "Bank ID: #" + bankId + ". ";
        boolean amountOK = false;
        boolean yearsOK = false;

        if (creditScore < acceptableCreditScore) {
            return response += "[§Denied] Loan not accepted."; //No way this loan goes through
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