package holdkrykke.registersaleservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

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
