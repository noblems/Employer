package employees.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employees.entity.Note;


@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
