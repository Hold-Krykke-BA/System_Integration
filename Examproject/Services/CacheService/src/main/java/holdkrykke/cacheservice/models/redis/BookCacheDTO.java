package holdkrykke.cacheservice.models.redis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import java.io.Serializable;



@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash(value = "Book")
public class BookCacheDTO implements Serializable {
    private String id, location;
    private int quantity;
    private Long _TimeToLive;

    public BookCacheDTO(String id, String location, int quantity) {
        this.id = id;
        this.location = location;
        this.quantity = quantity;
    }
}

