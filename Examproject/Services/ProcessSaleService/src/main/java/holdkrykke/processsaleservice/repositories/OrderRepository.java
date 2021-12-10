package holdkrykke.processsaleservice.repositories;

import holdkrykke.processsaleservice.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface OrderRepository extends MongoRepository<Order, String> {

    public Order findByOrderNumber(String orderNum);
    public List<Order> findByOrderStatus(String status);
    public List<Order> findAll();

}
