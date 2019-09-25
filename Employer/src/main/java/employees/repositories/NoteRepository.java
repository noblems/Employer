package employees.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employees.entity.Note;


@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
	List<Note> findByName(String name);
}
