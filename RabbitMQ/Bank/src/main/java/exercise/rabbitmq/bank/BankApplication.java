package exercise.rabbitmq.bank;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.SerializationUtils;

import java.io.ByteArrayInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

@SpringBootApplication
public class BankApplication {

    private static final String EXCHANGE_NAME = "topic_banks";
    private final static String HOST = "localhost";


    public static void main(String[] args) throws Exception {
        SpringApplication.run(BankApplication.class, args);

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "topic");
        String queueName = channel.queueDeclare().getQueue();

        if (args.length < 1) {
            System.err.println("Usage: [binding_key].\nExample: banks.house || bank.* || #");
            //System.exit(1); todo reinstate
        }

        String[] keys = args;
        if (keys.length == 0) {
            keys = new String[]{"#"};
        }

        for (String bindingKey : keys) {
            channel.queueBind(queueName, EXCHANGE_NAME, bindingKey);
            System.out.println("Bound queue: " + queueName + "\t" + EXCHANGE_NAME + "\t" + bindingKey);
        }

        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            //String message = new String(delivery.getBody(), "UTF-8");
            //ClientDTO response = (ClientDTO) SerializationUtils.deserialize(delivery.getBody());
            ClientDTO result = null;
            ByteArrayInputStream bis = new ByteArrayInputStream(delivery.getBody());
            ObjectInput in = new ObjectInputStream(bis);
            try {
                result = (ClientDTO) in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(" [x] Received '" + delivery.getEnvelope().getRoutingKey() + "':'" + result + "'");
        };
        channel.basicConsume(queueName, true, deliverCallback, consumerTag -> {
        });
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
}


