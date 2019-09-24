package employees;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class InsertTest {  
public static void main(String[] args) {  
      
    Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    EmployeeDao dao=(EmployeeDao)factory.getBean("d");  
      
    Employee e=new Employee(114,"varun",50000);  
   /* e.setId(114);  
    e.setName("varun");  
    e.setSalary(50000);  */
      System.out.print("done");
    dao.saveEmployee(e);  
      
}  
} 