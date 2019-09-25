package employees.repositories;
import employees.entity.Note;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookCrudRepository extends CrudRepository<Note, Long> {
}
