package holdkrykke.cacheservice.models.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private String id;
    private String isbn;
    private String title;
    private String[] authors;
    private String[] subjects;
    private String location;
    private String language;
    private int pages;
    private int year;
    private int quantity;
    private String type; // ebook, audiobook, book
    private Double price;
}
