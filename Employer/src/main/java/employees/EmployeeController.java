package employees;

import java.util.concurrent.atomic.AtomicLong;
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
		return new Employee("noble","m",String.format(template, name));
	}
    @RequestMapping(method = RequestMethod.POST)

    String post() {

        return "Hello from post";

    }
}

