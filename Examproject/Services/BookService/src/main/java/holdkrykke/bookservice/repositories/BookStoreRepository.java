package holdkrykke.bookservice.repositories;


import holdkrykke.bookservice.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
//todo https://stackoverflow.com/questions/22824840/when-to-use-restcontroller-vs-repositoryrestresource
public interface BookStoreRepository extends MongoRepository<Book, String> {
}
