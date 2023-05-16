package com.ishan.learns.springboot.cruddemo.dao;

import com.ishan.learns.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
