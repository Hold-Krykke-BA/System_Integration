package holdkrykke.cacheservice.controllers.externalAPI;

import holdkrykke.cacheservice.models.Book.Book;
import holdkrykke.cacheservice.repositories.mongo.BookRepository;
import holdkrykke.cacheservice.services.external.ExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
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

    @GetMapping("/getBooksByAuthors/{authors}") // "j k rowling, William Taylor Adams"
    public String getBooksByAuthor(@PathVariable String authors) {
        return externalService.getBooksByAuthor(authors);
    }

    @GetMapping("/getBooksByTitle/{title}") // "wool"
    public String getBooksByTitle(@PathVariable String title) {
        return externalService.getBooksByTitle(title);
    }
}
