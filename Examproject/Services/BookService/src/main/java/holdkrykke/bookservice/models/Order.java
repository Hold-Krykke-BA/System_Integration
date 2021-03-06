package holdkrykke.bookservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * The Order DTO from the RegisterSale service
 */
public class Order implements Serializable {
    @Id
    private String id;
    private String orderNumber;
    private String orderStatus;
    private String orderType; // book, ebook, audiobook, ebook/audiobook
    private String customerMail;
    private String customerFullName;
    private String customerAddress;
    private Double totalPrice;
    private List<OrderItem> orderItems;

    public Order(Order order) {
        this.id = order.id;
        this.orderNumber = order.getOrderNumber();
        this.orderStatus = order.getOrderStatus();
        this.orderType = order.getOrderType();
        this.customerMail = order.getCustomerMail();
        this.customerFullName = order.getCustomerFullName();
        this.customerAddress = order.getCustomerAddress();
        this.totalPrice = order.getTotalPrice();
        this.orderItems = order.getOrderItems();
    }
}