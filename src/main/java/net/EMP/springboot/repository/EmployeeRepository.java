package net.EMP.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.EMP.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>  {

}
