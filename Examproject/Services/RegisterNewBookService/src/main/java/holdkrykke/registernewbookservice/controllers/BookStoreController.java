package holdkrykke.registernewbookservice.controllers;

import holdkrykke.registernewbookservice.repositories.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Todo
 */
@RestController
@RequestMapping("/books")
public class BookStoreController {

    @Autowired
    private BookStoreRepository repo;
}
