package net.EMP.springboot.service;

import java.util.List;

import net.EMP.springboot.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(long id);
	
	Employee updateEmployee(Employee employee,long id);
	
	void deleteEmployee(long id);
	
	 

}
