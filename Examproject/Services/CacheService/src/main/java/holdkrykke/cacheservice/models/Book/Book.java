package holdkrykke.cacheservice.models.Book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String ISBN;
    private String title;
    private String authors;
    private String edition;
    private String location;
    private int pages;
    private int year;
    private Boolean isDigital;
    private Double price;
}
