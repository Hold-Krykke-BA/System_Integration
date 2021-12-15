package holdkrykke.bookservice.repositories;

import holdkrykke.bookservice.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BookStoreRepository extends MongoRepository<Book, String> {

    public Book findByIsbn(String isbn);
    public List<Book> findByAuthors(String[] authors);
    public List<Book> findByTitle(String title);

}
