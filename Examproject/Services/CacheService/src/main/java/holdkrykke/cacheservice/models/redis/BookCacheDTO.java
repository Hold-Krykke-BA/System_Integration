package holdkrykke.cacheservice.models.redis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import java.io.Serializable;



@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash(value = "Book")
public class BookCacheDTO implements Serializable {
    @Id
    private String isbn;
    private String title;
    private String[] authors;
    private String location;
    private String type; // ebook, audiobook, book
    private Double price;
    private int quantity;
    private Long _TimeToLive;
}

