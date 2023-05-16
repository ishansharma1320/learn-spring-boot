package com.ishan.learns.springboot.cruddemo.service;

import com.ishan.learns.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> findAll();

    Employee findById(int id);

    void deleteById(int id);

    Employee update(Employee employee);
}
