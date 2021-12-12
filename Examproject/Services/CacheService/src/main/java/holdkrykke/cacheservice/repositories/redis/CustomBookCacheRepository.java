package holdkrykke.cacheservice.repositories.redis;

import holdkrykke.cacheservice.models.redis.BookCacheDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

/**
 * This was supposed to allow us to override the CrudRepository.findById for custom implementation but we were not.
 * <p>
 * Todo delete
 */
@Repository
public interface CustomBookCacheRepository extends CrudRepository<BookCacheDTO, String> {

    @Override
    public abstract Optional<BookCacheDTO> findById(String s);

}
