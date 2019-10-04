package employees;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import domain.Users;
import employees.service.UserService;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private UserService userService;

    @RequestMapping(value="/greeting",produces=MediaType.APPLICATION_XML_VALUE)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) throws IOException {
    	
        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }
    @RequestMapping(value="/insert",produces=MediaType.APPLICATION_XML_VALUE)
    public Greeting insert(@RequestParam(value="name", defaultValue="done") String name) throws IOException {
    	userService = new UserService();
    	Users user = new Users();
	     user.setEmailId("test_email_"+System.currentTimeMillis()+"@gmail.com");
	     user.setPassword("secret");
	     user.setFirstName("TestFirstName");
	     user.setLastName("TestLastName");
	 
	     userService.insertUser(user);
        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }
    
}