package holdkrykke.cacheservice.services;

import holdkrykke.cacheservice.repositories.mongo.BookRepository;
import holdkrykke.cacheservice.repositories.redis.BookCacheRepository;
import holdkrykke.cacheservice.services.external.ExternalService;
import org.apache.camel.CamelContext;
import org.apache.camel.ExchangePattern;
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

//    @Autowired
//    private CamelContext context;

    public boolean handleIncoming(String isbn, List<String> authors, String title) {
        //Main application flow
        //Get input from gRPC

//        context.getEndpoint("mainroute:in").createExchange(ExchangePattern.InOut).setProperty();

//        var exchange = context.getEndpoint("direct:cache").createExchange(ExchangePattern.InOut);
//        exchange.setProperty("type", "cache");

//        exchange.setMessage();


        //https://camel.apache.org/manual/pojo-producing.html
        //https://camel.apache.org/manual/pojo-consuming.html

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
