package holdkrykke.processsaleservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
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
