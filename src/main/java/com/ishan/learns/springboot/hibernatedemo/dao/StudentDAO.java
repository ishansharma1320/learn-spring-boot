package com.ishan.learns.springboot.hibernatedemo.dao;

import com.ishan.learns.springboot.hibernatedemo.entity.Student;

public interface StudentDAO {
    public void save(Student student);
    public Student findById(Integer id);
}
