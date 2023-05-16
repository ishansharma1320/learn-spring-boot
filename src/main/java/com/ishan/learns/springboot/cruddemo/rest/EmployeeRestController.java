package com.ishan.learns.springboot.cruddemo.rest;

import com.ishan.learns.springboot.cruddemo.dao.EmployeeDAO;
import com.ishan.learns.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    @Autowired
    private EmployeeRestController(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    private List<Employee> getEmployees(){
        return this.employeeDAO.findAll();
    }
}
