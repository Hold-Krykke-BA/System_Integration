package holdkrykke.cacheservice.services;

import holdkrykke.cacheservice.repositories.mongo.BookRepository;
import holdkrykke.cacheservice.repositories.redis.BookCacheRepository;
import holdkrykke.cacheservice.services.external.ExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ExternalService externalService;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookCacheRepository redisRepository;

    public boolean handleIncoming(String isbn, List<String> authors, String title) {
        //Main application flow
        //Get input from gRPC

        //Check cache
        //if in cache, update expiration, return data

        //if not in cache
        //check local database
        //check external API
        //consolidate both
        //camel(?)

        boolean success = true;
        return success;
    }


}
