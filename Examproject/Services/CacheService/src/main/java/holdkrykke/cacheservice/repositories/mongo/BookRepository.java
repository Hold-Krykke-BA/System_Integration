package holdkrykke.cacheservice.repositories.mongo;

import holdkrykke.cacheservice.models.Book.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    public Book findByIsbn(String isbn);
    public List<Book> findByAuthors(String[] authors);
    public List<Book> findByTitle(String title);

}