package holdkrykke.client.producer;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

//Taken from producer3: https://github.com/datsoftlyngby/soft2021fall-SI/blob/main/code/p9-Kafka/P9-Kafka-Producer-3/src/main/java/dk/dd/kafkaproducer3/producer/TopicConfiguration.java

@Configuration
public class TopicConfiguration {

    @Value("${spring.kafka.producer.topic}") //This points to application.yml
    String topic;

    @Bean
    public NewTopic topicExample()
    {
        return TopicBuilder.name(topic)
                .partitions(2)
                .replicas(1)
                .build();
    }
}
