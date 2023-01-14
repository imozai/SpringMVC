package com.projectBE.service;

import com.projectBE.entity.Employee;
import com.projectBE.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> listAll() {
        return repo.findAll();
    }

    public void save(Employee employee) {
        repo.save(employee);
    }

    public Employee get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
