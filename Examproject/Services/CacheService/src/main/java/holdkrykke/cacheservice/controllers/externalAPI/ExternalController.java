package holdkrykke.cacheservice.controllers.externalAPI;

import holdkrykke.cacheservice.repositories.mongo.BookRepository;
import holdkrykke.cacheservice.services.external.ExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/external")
public class ExternalController {
    private static final Logger logger = LoggerFactory.getLogger(ExternalController.class);
    @Autowired
    ExternalService externalService;

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/getBookByISBN/{isbn}") // "940013196292"
    public String getBookByISBN(@PathVariable String isbn) {
        logger.info("Getting book from external API SERVICE by ISBN: [{}]", isbn);
        return externalService.getBooksByISBN(isbn);
    }

    @PostMapping("/getBooksByAuthors/") // ["j k rowling", "William Taylor Adams"]
    public String getBooksByAuthor(@RequestBody String[] authors) {
        logger.info("Getting book from external API SERVICE by authors: [{}]", Arrays.toString(authors));
        return externalService.getBooksByAuthor(List.of(authors));
    }

    @GetMapping("/getBooksByTitle/{title}") // "wool"
    public String getBooksByTitle(@PathVariable String title) {
        logger.info("Getting book from external API SERVICE by title: [{}]", title);
        return externalService.getBooksByTitle(title);
    }
}
