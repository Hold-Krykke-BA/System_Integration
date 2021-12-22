package holdkrykke.cacheservice.models.grpc;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import holdkrykke.cacheservice.models.Book.Book;
import holdkrykke.cacheservice.models.redis.BookCacheDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

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

    /**
     * Create a ResponseDTO from a JsonObject (from the external API)
     *
     * @param intermediary
     */
    public ResponseDTO(JsonObject intermediary) {
        this.isbn = intermediary.getAsJsonArray("isbn").get(0).getAsString();
        this.title = intermediary.get("title").getAsString();
        this.authors = toStringArray(intermediary.getAsJsonArray("author_name"));
        this.location = "external";
        //Rest is handled by ProtoService
        this.type = "";
        this.price = null;
        this.quantity = -1;
    }

    private static String[] toStringArray(JsonArray array) {
        if (array == null)
            return null;

        String[] result = new String[array.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = array.get(i).getAsString();
        }
        return result;
    }
}
