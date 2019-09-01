package employees.dao;

import java.util.List;

import employees.entity.EmployeeEntity;


public interface EmployeeDAO 
{
    public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public EmployeeEntity showEmployee(Integer employeeId);
    public void deleteEmployee(Integer employeeId);
}