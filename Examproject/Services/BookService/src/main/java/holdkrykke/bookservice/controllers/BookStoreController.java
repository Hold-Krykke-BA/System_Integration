package holdkrykke.bookservice.controllers;

import holdkrykke.bookservice.models.Book;
import holdkrykke.bookservice.repositories.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

@RestController
@RequestMapping("/books")
public class BookStoreController {

    @Autowired
    private BookStoreRepository repo;

    @PostMapping("/")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @Consumes(MediaType.APPLICATION_JSON_VALUE)
    public Book addBook(Book book) { //may need to use a BookDTO instead
        if (book == null || !(book instanceof Book)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Could not parse book");
        }
        return repo.save(book);
    }
}
