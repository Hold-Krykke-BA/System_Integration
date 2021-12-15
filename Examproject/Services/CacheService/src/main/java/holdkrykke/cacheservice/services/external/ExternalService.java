package holdkrykke.cacheservice.services.external;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ExternalService {
    private static final Logger logger = LoggerFactory.getLogger(ExternalService.class);

    public String getBooksByISBN(String isbn){
        String url = "https://openlibrary.org/search.json?isbn="+isbn;
        RestTemplate template = new RestTemplate();
        String books = template.getForObject(url, String.class);
        logger.info("Received books by ISBN from external API [{}]", books);
        return books;
    }

    public String getBooksByAuthor(List<String> authors){
        String url = "https://openlibrary.org/search/authors.json?q=";
        String[] urls = new String[authors.size()];
        RestTemplate template = new RestTemplate();
        String books = "";

        for (int i = 0; i < authors.size(); i++) {
            String temp = url + authors.get(i);
            urls[i] = temp;
        }
        for(String _url : urls){
            String temp = template.getForObject(_url, String.class);
            if(temp == null || temp.isEmpty()) continue;
            books = books + temp + ",";
        }
        logger.info("Received books by Author from external API [{}]", books);
        return books;
    }

    public String getBooksByTitle(String title){
        String url = "https://openlibrary.org/search.json?q=" + title;
        RestTemplate template = new RestTemplate();
        String books = template.getForObject(url, String.class);
        logger.info("Received books by Title from external API [{}]", books);
        return books;
    }
}
