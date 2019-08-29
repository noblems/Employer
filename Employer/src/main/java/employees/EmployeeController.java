package employees;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public Employee greeting(@RequestParam(value="name", defaultValue="unknown") String name) {
		//return new Employee(counter.incrementAndGet(),String.format(template, name));
		return new Employee(12,String.format(template, name),121);
	}
    @RequestMapping(method = RequestMethod.POST,value="/insert")
    public String insert() {
    	Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        EmployeeDao dao=(EmployeeDao)factory.getBean("d");  
          
        Employee e=new Employee(114,"varun",50000);  
       /* e.setId(114);  
        e.setName("varun");  
        e.setSalary(50000);  */
          System.out.print("done");
        dao.saveEmployee(e); 
        return "done";
    }

    String post() {

        return "Hello from post";

    }
}

