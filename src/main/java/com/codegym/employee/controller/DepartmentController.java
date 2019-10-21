package com.codegym.employee.controller;


import com.codegym.employee.model.Department;
import com.codegym.employee.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/departments", method = RequestMethod.GET)
    public ResponseEntity<List<Department>> listDepartment() {
        List<Department> departments = departmentService.findAll();
        if (departments.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    @RequestMapping(value = "department", method = RequestMethod.POST)
    public ResponseEntity<Void> createDepartment(@RequestBody Department department) {
        departmentService.save(department);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
