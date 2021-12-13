package holdkrykke.cacheservice.models.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private String _id;
    private String ISBN;
    private String title;
    private String authors;
    private String edition;
    private String subject;
    private String location;
    private String language;
    private int pages;
    private int year;
    private int quantity;
    private Boolean isDigital;
    private Double price;
}
