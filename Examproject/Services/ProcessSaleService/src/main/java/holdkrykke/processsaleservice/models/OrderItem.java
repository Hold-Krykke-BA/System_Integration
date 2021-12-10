package holdkrykke.processsaleservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    private String ISBN;
    private String title;
    private String authors;
    private String edition;
    private int pages;
    private int year;
    private Boolean isDigital;
    private Double price;

}
