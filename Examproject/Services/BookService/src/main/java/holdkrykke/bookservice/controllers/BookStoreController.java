package holdkrykke.bookservice.controllers;

import holdkrykke.Exceptions.ISBNValidationException;
import holdkrykke.bookservice.models.Book;
import holdkrykke.bookservice.repositories.BookStoreRepository;
import holdkrykke.bookservice.services.soap.ISBNValidationClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookStoreController {
    private static final Logger logger = LoggerFactory.getLogger(BookStoreController.class);

    @Autowired
    private BookStoreRepository repo;

    @Autowired
    ISBNValidationClient ISBNclient;

    @PostMapping("/")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @Consumes(MediaType.APPLICATION_JSON_VALUE)
    public Book addBook(@RequestBody Book book) throws ISBNValidationException {
        logger.info("Adding book [{}]", book);
        if (book == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Could not parse book");
        }
        try {
            boolean validated = ISBNclient.validateISBN(book.getIsbn());
            logger.info("Book ISBN validated [{}]", validated);
            if(validated){
                return repo.save(book);
            }
        } catch (ISBNValidationException ex) {
            logger.error("Exception caught: [{}]", ex);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
        throw new ISBNValidationException("Book not validated");
    }

    @GetMapping("/")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllBooks() {
        logger.info("Retrieving books from database");
        return repo.findAll();
    }
}
