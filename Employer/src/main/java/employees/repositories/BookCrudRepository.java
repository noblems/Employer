package employees.repositories;
import employees.entity.Note;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public class BookCrudRepository implements CrudRepository<Note, Long> {
	//List<Note> findByName(String name);

	public <S extends Note> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Note> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Note> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<Note> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Note> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Note entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Note> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}

