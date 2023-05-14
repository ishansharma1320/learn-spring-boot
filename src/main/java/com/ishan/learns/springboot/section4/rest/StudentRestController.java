package com.ishan.learns.springboot.section4.rest;

import com.ishan.learns.springboot.section4.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;
    @PostConstruct
    private void loadData(){
        students = new ArrayList<>();
        students.add(new Student("Ishan","Sharma"));
        students.add(new Student("John","Doe"));
        students.add(new Student("James","Bond"));
    }
    @GetMapping("/students")
    private List<Student> getStudents(){
        return students;
    }


    @GetMapping("/students/{studentId}")
    private Student getStudentById(@PathVariable int studentId){
        int actualStudentId = studentId - 1; // because studentId starts from 1
        Student result = null;
        if (actualStudentId >= 0 && actualStudentId < this.students.size()){
            result = this.students.get(actualStudentId);
        } else {
            throw new StudentNotFoundException("student not found with ID: "+studentId);
        }
        return result;
    }

    @ExceptionHandler
    private ResponseEntity<StudentErrorResponse> handleStudentNotFoundException(StudentNotFoundException exc){
        StudentErrorResponse errorResponse = new StudentErrorResponse();
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    private ResponseEntity<StudentErrorResponse> handleAllExceptions(Exception exc){
        StudentErrorResponse errorResponse = new StudentErrorResponse();
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
