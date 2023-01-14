package com.projectBE.repository;

import com.projectBE.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
