package holdkrykke.cacheservice.services.redis;

import holdkrykke.cacheservice.models.redis.BookCacheDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration.JedisClientConfigurationBuilder;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;

//https://docs.spring.io/spring-data/redis/docs/current/reference/html/#reference
@Configuration
public class RedisConfig {

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        //application.properties does not work
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        redisStandaloneConfiguration.setHostName("localhost");
        redisStandaloneConfiguration.setPort(6379);
        redisStandaloneConfiguration.setDatabase(0);

        JedisClientConfigurationBuilder jedisClientConfiguration = JedisClientConfiguration.builder();
        jedisClientConfiguration.connectTimeout(Duration.ofSeconds(60));// 60s connection timeout
        //can set up pooling here if necessary

        JedisConnectionFactory jedisConFactory = new JedisConnectionFactory(redisStandaloneConfiguration,
                jedisClientConfiguration.build());
        return jedisConFactory;
    }

    @Bean
    public RedisTemplate<String, BookCacheDTO> redisTemplate() {
        RedisTemplate<String, BookCacheDTO> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        template.setKeySerializer(new StringRedisSerializer()); //Serialize as actual String key in the database, rather than <JavaObject><Key>

        return template;
    }
}
