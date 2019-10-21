package com.codegym.employee.service;

import com.codegym.employee.model.Department;
import com.codegym.employee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    List<Department> findAll();
    Optional<Department> findById(Long id);
    void save (Department department);
    void remove(Long id);
}
