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
        // mongo test start
        Book book = new Book();
        book.setISBN("0000000000");
        book.setTitle("Tester Book");
        book.setAuthors("T. Ester, Tes. Ter");
        book.setEdition("2");
        book.setLocation("local");
        book.setPages(288);
        book.setYear(2018);
        book.setIsDigital(true);
        book.setPrice(55.0);
        bookRepository.save(book);
        Book book1 = bookRepository.findByISBN("0000000000");
        List<Book> booksbytitle = bookRepository.findByTitle("Tester Book");
        List<Book> booksbyauthors = bookRepository.findByAuthors("T. Ester, Tes. Ter");
        System.out.println("book1: " + book1);
        for(Book _book : booksbytitle){
            System.out.println("bookbytitle: " + book);
        }
        for(Book _book : booksbyauthors){
            System.out.println("booksbyauthors: " + book);
        }
        // mongo test end
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
