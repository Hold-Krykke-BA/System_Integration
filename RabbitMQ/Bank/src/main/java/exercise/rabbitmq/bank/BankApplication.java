package exercise.rabbitmq.bank;

import com.rabbitmq.client.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class BankApplication {

    private final static String QUEUENAME = "RPC_QUEUE";
    private final static String TOPICS = "TODO.TODO";
    private final static String HOST = "localhost";
    private final static int PORT = -1;

    static long maxAmount, minAmount;
    static int maxYears, minYears, acceptableCreditScore;


    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);

        //Set up parameters
        //String topic = args[0];
        maxAmount = Long.parseLong(args[0]);
        minAmount = Long.parseLong(args[1]);
        maxYears = Integer.parseInt(args[2]);
        minYears = Integer.parseInt(args[3]);
        acceptableCreditScore = Integer.parseInt(args[4]);

        loanApplication();
    }

    private static void loanApplication() {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost"); //port: 5672

        try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
            channel.queueDeclare(QUEUENAME, false, false, false, null);
            channel.queuePurge(QUEUENAME);

            channel.basicQos(1);

            System.out.println(" [x] Awaiting RPC requests");

            Object monitor = new Object();
            DeliverCallback deliverCallback = (consumerTag, delivery) -> {
                AMQP.BasicProperties replyProps = new AMQP.BasicProperties
                        .Builder()
                        .correlationId(delivery.getProperties().getCorrelationId())
                        .build();


                String response = "";
                try {
                    byte[] data = delivery.getBody();
                    //String message = new String(delivery.getBody(), "UTF-8");
                    ClientDTO obj = (ClientDTO) SerializationUtils.deserialize(data);

                    System.out.println(" [.] loan(" + obj + ")");
                    response = getLoanResponse(obj);
                } catch (RuntimeException e) {
                    System.out.println(" [.] " + e.toString());
                } finally {
                    channel.basicPublish("", delivery.getProperties().getReplyTo(), replyProps, response.getBytes("UTF-8"));
                    channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
                    // RabbitMq consumer worker thread notifies the RPC server owner thread
                    synchronized (monitor) {
                        monitor.notify();
                    }
                }
            };

            channel.basicConsume(QUEUENAME, false, deliverCallback, (consumerTag -> {
            }));
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
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }


    }

    private static String getLoanResponse(ClientDTO obj) {
        String response = "";
        boolean amountOK = false;
        boolean yearsOK = false;

        if (obj.getCreditScore() < acceptableCreditScore) {
            return ""; //No way this loan goes through
        }
        response += "Credit score OK. ";

        if (obj.getAmount() >= minAmount && obj.getAmount() <= maxAmount) {
            response += "Amount OK. ";
            amountOK = true;
        }
        if (obj.getYears() >= minYears && obj.getYears() <= maxYears) {
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

class ClientDTO implements Serializable {

    private String topic;
    private Long amount;
    private int years, creditScore;

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