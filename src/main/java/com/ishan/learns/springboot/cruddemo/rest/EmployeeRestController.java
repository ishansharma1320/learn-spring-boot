package com.ishan.learns.springboot.cruddemo.rest;

import com.ishan.learns.springboot.cruddemo.entity.Employee;
import com.ishan.learns.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    private List<Employee> getEmployees(){
        return this.employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    private Employee getEmployeeById(@PathVariable int employeeId){
        Employee employee = this.employeeService.findById(employeeId);
        if(employee == null){
            throw new RuntimeException("Employee not found");
        }
        return employee;
    }
    @PostMapping("/employees")
    private Employee createEmployee(@RequestBody Employee employee){
        // just in case id is passed, so to trigger creation of new employee instead of update
        employee.setId(0);

        return this.employeeService.save(employee);
    }

    @PutMapping("/employees")
    private Employee updateEmployee(@RequestBody Employee employee){
        return this.employeeService.save(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    private String deleteEmployee(@PathVariable(name = "employeeId") int empId){
        Employee employee = this.employeeService.findById(empId);
        if(employee == null){
            throw new RuntimeException("Employee not found");
        }
        this.employeeService.deleteById(empId);
        return "Employee Deleted - ID: "+empId;
    }
}
