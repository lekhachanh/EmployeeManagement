package com.codegym.employee.service;

import com.codegym.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    Optional<Employee> findById(Long id);
    void save (Employee employee);
    void remove(Long id);

}


