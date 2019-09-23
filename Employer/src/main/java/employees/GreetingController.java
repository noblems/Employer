package employees;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public FileOutputStream greeting(@RequestParam(value="name", defaultValue="World") String name) throws IOException {
    	Resource r=new ClassPathResource("./applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
    	EmployeeMarshaller em=(EmployeeMarshaller) factory.getBean("application");
       // return new Greeting(counter.incrementAndGet(),
                //            String.format(template, name));
        return em.returnXml();
    }
}