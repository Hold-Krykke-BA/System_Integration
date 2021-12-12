package holdkrykke.registersaleservice.repositories;

import java.util.List;

import holdkrykke.registersaleservice.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrderRepository extends MongoRepository<Order, String> {

    public Order findByOrderNumber(String orderNum);
    public List<Order> findByOrderStatus(String status);
    public List<Order> findAll();

}
