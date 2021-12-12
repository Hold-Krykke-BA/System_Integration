package holdkrykke.cacheservice.controllers.grpc;

import holdkrykke.cacheservice.exceptions.NotFoundException;
import holdkrykke.cacheservice.models.redis.BookCacheDTO;
import holdkrykke.cacheservice.repositories.redis.BookCacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/cache")
/**
 * This is purely for testing. The cache should not be available outside gRPC which calls it internally.
 *
 * To test, run app, and add a new predefined entry:
 * http://localhost:9005/cache/
 * Then get it by the following endpoint, and notice how the TTL changes
 * http://localhost:9005/cache/get
 *
 * todo delete
 */
public class RedisController {

    @Autowired
    private BookCacheRepository repo;

    @GetMapping("/")
    public boolean addNew() {
        repo.saveBook(new BookCacheDTO("1234", "external", 5));
        return true;
    }

    @GetMapping("/get")
    public BookCacheDTO getCacheItem() {
        BookCacheDTO result = null;
        try {
            result = repo.findBookById("1234");
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Result: " + result);
        return result;
    }

}
