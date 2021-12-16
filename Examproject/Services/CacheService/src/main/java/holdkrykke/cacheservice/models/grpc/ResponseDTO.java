package holdkrykke.cacheservice.models.grpc;

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
}
