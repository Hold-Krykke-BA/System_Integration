package holdkrykke.cacheservice.services.external;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ExternalService {

    public String getBooksByISBN(String isbn){
        String url = "https://openlibrary.org/search.json?isbn="+isbn;
        RestTemplate template = new RestTemplate();
        String books = template.getForObject(url, String.class);
        System.out.println(books);
        return books;
    }

    public String getBooksByAuthor(String authorsStr){
        String url = "https://openlibrary.org/search/authors.json?q=";
        String[] authors = authorsStr.split(",");
        String[] urls = new String[authors.length];
        RestTemplate template = new RestTemplate();
        String books = "";

        for (int i = 0; i < authors.length; i++) {
            String temp = url + authors[i];
            urls[i] = temp;
            System.out.println("urls[i] " + urls[i]);
        }
        for(String _url : urls){
            String temp = template.getForObject(_url, String.class);
            if(temp == null || temp.isEmpty()) continue;
            books = books + temp + ",";
            System.out.println("temp " + temp);
        }
        System.out.println(books);
        return books;
    }

    public String getBooksByTitle(String title){
        String url = "https://openlibrary.org/search.json?q=" + title;
        RestTemplate template = new RestTemplate();
        String books = template.getForObject(url, String.class);
        System.out.println(books);
        return books;
    }
}
