package employees.controllers;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import employees.EmployeeDao;
import employees.entity.Note;
import employees.repositories.NoteRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {
	Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    NoteRepository noteRepository=(NoteRepository)factory.getBean("noteRepository");
    //@Autowired
   // private NoteRepository noteRepository;

    // Get All Notes
    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }
    // Create a new Note

    // Get a Single Note

    // Update a Note

    // Delete a Note
}