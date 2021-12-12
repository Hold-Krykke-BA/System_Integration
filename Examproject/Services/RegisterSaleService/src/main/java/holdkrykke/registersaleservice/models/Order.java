package holdkrykke.registersaleservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    private String id;
    private String orderNumber;
    private String orderStatus;
    private String orderType;
    private String customerMail;
    private String customerFullName;
    private String customerAddress;
    private Double totalPrice;
    private List<OrderItem> orderItems;
}
