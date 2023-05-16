package com.ishan.learns.springboot.cruddemo.dao;

import com.ishan.learns.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    private EntityManager entityManager;

    @Autowired
    EmployeeDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Employee employee) {
        this.entityManager.persist(employee);
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> findAllQuery = this.entityManager.createQuery("FROM Employee",Employee.class);
        List<Employee> result = findAllQuery.getResultList();
        return result;
    }

    @Override
    public Employee findById(int id) {
        return this.entityManager.find(Employee.class, id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Employee employee = findById(id);
        this.entityManager.remove(employee);
    }

    @Override
    @Transactional
    public void update(Employee employee) {
        this.entityManager.merge(employee);
    }
}
