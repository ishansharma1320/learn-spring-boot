package com.ishan.learns.springboot.section4.rest;

import com.ishan.learns.springboot.section4.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("students")
    private List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ishan","Sharma"));
        students.add(new Student("John","Doe"));
        students.add(new Student("James","Bond"));

        return students;
    }
}
