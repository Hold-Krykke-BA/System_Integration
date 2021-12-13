package holdkrykke.cacheservice.controllers.externalAPI;

import holdkrykke.cacheservice.models.Book.Book;
import holdkrykke.cacheservice.repositories.mongo.BookRepository;
import holdkrykke.cacheservice.services.external.ExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/external")
public class ExternalController {
    @Autowired
    ExternalService externalService;

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/getBookByISBN/{isbn}") // "940013196292"
    public String getBookByISBN(@PathVariable String isbn) {
        return externalService.getBooksByISBN(isbn);
    }

    @PostMapping("/getBooksByAuthors/") // ["j k rowling", "William Taylor Adams"]
    public String getBooksByAuthor(@RequestBody String[] authors) {
        return externalService.getBooksByAuthor(List.of(authors));
    }

    @GetMapping("/getBooksByTitle/{title}") // "wool"
    public String getBooksByTitle(@PathVariable String title) {
        return externalService.getBooksByTitle(title);
    }
}
