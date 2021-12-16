package holdkrykke.cacheservice.models.grpc;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import holdkrykke.cacheservice.models.Book.Book;
import holdkrykke.cacheservice.models.redis.BookCacheDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO implements Serializable {
    private String isbn;
    private String title;
    private String[] authors;
    private String location;
    private String type; // ebook, audiobook, book
    private Double price;
    //below is different from OrderItem
    private int quantity;

    /**
     * Create a ResponseDTO from a BookCacheDTO
     *
     * @param dto
     */
    public ResponseDTO(BookCacheDTO dto) {
        this.isbn = dto.getIsbn();
        this.title = dto.getTitle();
        this.authors = dto.getAuthors();
        this.location = dto.getLocation();
        this.type = dto.getType();
        this.price = dto.getPrice();
        this.quantity = dto.getQuantity();
    }

    /**
     * Create a ResponseDTO from a Book
     *
     * @param book
     */
    public ResponseDTO(Book book) {
        this.isbn = book.getIsbn();
        this.title = book.getTitle();
        this.authors = book.getAuthors();
        this.location = book.getLocation();
        this.type = book.getType();
        this.price = book.getPrice();
        this.quantity = book.getQuantity();
    }

    public ResponseDTO(JsonObject intermediary) {
        //intermediary.get("blah");
    }
}
