package holdkrykke.si.rest;

import org.springframework.data.jpa.repository.JpaRepository; //also possible but has other methods
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
