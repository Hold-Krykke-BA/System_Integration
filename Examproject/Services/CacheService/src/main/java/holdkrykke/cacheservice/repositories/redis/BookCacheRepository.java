package holdkrykke.cacheservice.repositories.redis;

import holdkrykke.cacheservice.exceptions.NotFoundException;
import holdkrykke.cacheservice.models.redis.BookCacheDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * This repository the default repository for Redis
 */
@Repository
public class BookCacheRepository {
    private static int _CACHE_DURATION = 300;
    private static TimeUnit _UNIT = TimeUnit.SECONDS;
    private static final Logger logger = LoggerFactory.getLogger(BookCacheRepository.class);

    @Autowired
    RedisTemplate<String, BookCacheDTO> redisTemplate;


    /**
     * Get current contents of the cache
     * <p>
     * Internally, it gets all keys using SCAN, and then multiGets on the keys.
     *
     * @return a list of cache items
     */
    public List<BookCacheDTO> getCache() {
        var keys = getKeys();
        return redisTemplate.opsForValue().multiGet(keys);
    }

    /**
     * Private method to get all available keys from cache
     *
     * @return
     */
    private List<String> getKeys() {
        List<String> keys = new ArrayList<>();
        RedisConnection redisConnection = null;
        try {
            redisConnection = redisTemplate.getConnectionFactory().getConnection();
            ScanOptions options = ScanOptions.scanOptions().match("*").count(100).build();

            Cursor c = redisConnection.scan(options);
            while (c.hasNext()) {
                var result = new String((byte[]) c.next());
                keys.add(result);
            }
        } finally {
            redisConnection.close(); //Ensure closing this connection.
        }
        return keys;
    }

    /**
     * Save a book to the redis cache and apply default time to live of 5 minutes
     *
     * @param book
     */
    public void saveBook(BookCacheDTO book) {
        redisTemplate.opsForValue().set(
                book.getIsbn(), book, _CACHE_DURATION, _UNIT
        );
    }

    /**
     * Are you sure you want this and not findByIdAndRefreshExpiration?
     *
     * @param id
     * @return
     * @throws NotFoundException
     */
    public BookCacheDTO findBookById(String id) throws NotFoundException {
        var keyBoundOps = redisTemplate.boundValueOps(id);
        var result = keyBoundOps.get(); //get book, may be null
        result.set_TimeToLive(keyBoundOps.getExpire()); //get expiry time, and attach to obj
        return result;
    }


    /**
     * Finds a book by ID and refreshes its token to the default.
     *
     * @param id isbn of the book
     * @return Book if found, otherwise null
     * @throws NotFoundException if unable to set expiration.
     */
    public BookCacheDTO findBookByIdAndRefreshExpiration(String id) throws NotFoundException {
        var keyBoundOps = redisTemplate.boundValueOps(id);
        BookCacheDTO book = keyBoundOps.get(); //get book, may be null

        if (book == null) {
            //Break, do not set new expiration
            return book;
        }

        //refresh expiry timer
        boolean success = keyBoundOps.expire(_CACHE_DURATION, _UNIT);
        if (!success) {
            throw new NotFoundException("Could not set new expiration for item");
        }
        book.set_TimeToLive(keyBoundOps.getExpire());
        return book;
    }
}

