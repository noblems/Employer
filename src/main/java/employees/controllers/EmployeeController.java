package employees.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import employees.dao.EmployeeDAO;
import employees.entity.EmployeeEntity;
import employees.entity.Greeting;

@RestController
public class EmployeeController {
	 @RequestMapping("/show")
	    public EmployeeEntity greeting(@RequestParam(value="id") String id) {
		 	EmployeeEntity employee=new EmployeeEntity("non","lal","djdh","1234");
		 	EmployeeDAO dao;
	        return employee;
	    }

}
