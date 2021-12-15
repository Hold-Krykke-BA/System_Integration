package holdkrykke.cacheservice.controllers.rest;

import holdkrykke.cacheservice.exceptions.NotFoundException;
import holdkrykke.cacheservice.models.redis.BookCacheDTO;
import holdkrykke.cacheservice.repositories.redis.BookCacheRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController()
@RequestMapping("/cache")
public class RedisController {
    private static final Logger logger = LoggerFactory.getLogger(RedisController.class);
    @Autowired
    private BookCacheRepository repo;

    @GetMapping("/")
    public List<BookCacheDTO> getCache() {
        return repo.getCache();
    }

    @PostMapping("/")
    public boolean addCacheItem(@RequestBody BookCacheDTO book) {
        try {
            repo.saveBook(book);
            logger.info("Added to cache [{}]", book);
            return true;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @GetMapping("/{isbn}")
    public BookCacheDTO getCacheItem(@PathVariable String isbn) {
        BookCacheDTO result = null;
        try {
            result = repo.findBookByIdAndRefreshExpiration(isbn);
            logger.info("Getting cache item [{}]", result);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        System.out.println("Result: " + result);
        return result;
    }
}