package holdkrykke.processsaleservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderNumberDTO implements Serializable {
    private String orderNumber;

    public OrderNumberDTO(Order order){
        this.orderNumber = order.getOrderNumber();
    }
}
