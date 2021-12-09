package holdkrykke.registersaleservice.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration
{
    @Value("${topic.name.producer}")
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