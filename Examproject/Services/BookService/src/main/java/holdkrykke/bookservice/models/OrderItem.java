package holdkrykke.bookservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * The OrderItem DTO from the RegisterSale service
 */
public class OrderItem implements Serializable {
    private String isbn;
    private String title;
    private String[] authors;
    private String location;
    private String type; // ebook, audiobook, book
    private Double price;
}
