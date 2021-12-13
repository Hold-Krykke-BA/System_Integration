package holdkrykke.bookservice.repositories;


import holdkrykke.bookservice.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookStoreRepository extends MongoRepository<Book, String> {


}
