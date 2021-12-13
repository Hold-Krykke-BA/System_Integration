package holdkrykke.bookservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "books")
public class Book {
    @Id
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