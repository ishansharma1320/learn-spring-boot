package com.ishan.learns.springboot.cruddemo.dao;

import com.ishan.learns.springboot.cruddemo.entity.Employee;

import java.util.List;
public interface EmployeeDAO {
    void save(Employee employee);
    List<Employee> findAll();

    Employee findById(int id);

    void deleteById(int id);

    void update(Employee employee);


}
