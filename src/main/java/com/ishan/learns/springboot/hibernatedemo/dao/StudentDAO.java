package com.ishan.learns.springboot.hibernatedemo.dao;

import com.ishan.learns.springboot.hibernatedemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    public void save(Student student);
    public Student findById(Integer id);

    public List<Student> findAll();
}
