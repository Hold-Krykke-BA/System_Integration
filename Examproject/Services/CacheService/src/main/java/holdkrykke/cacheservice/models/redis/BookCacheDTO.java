package holdkrykke.cacheservice.models.redis;

import holdkrykke.cacheservice.models.grpc.ResponseDTO;
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

    public BookCacheDTO(ResponseDTO dto) {
        this.isbn = dto.getIsbn();
        this.title = dto.getTitle();
        this.authors = dto.getAuthors();
        this.location = dto.getLocation();
        this.type = dto.getType();
        this.price = dto.getPrice();
        this.quantity = dto.getQuantity();
    }
}

