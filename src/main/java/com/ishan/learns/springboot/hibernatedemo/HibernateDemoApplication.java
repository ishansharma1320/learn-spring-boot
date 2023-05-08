package com.ishan.learns.springboot.hibernatedemo;

import com.ishan.learns.springboot.hibernatedemo.dao.StudentDAO;
import com.ishan.learns.springboot.hibernatedemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class HibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
	return runner -> {
//		getAllStudents(studentDAO);
		updateStudent(studentDAO);
	};
	}

	private void updateStudent(StudentDAO studentDAO){
		Integer id = 1;
		Student student = studentDAO.findById(id);
		student.setFirstName("Jacky");
		studentDAO.update(student);
		student = studentDAO.findById(id);
		System.out.println(student);

	}
	private void findByLastName(StudentDAO studentDAO, String lastName) {
		List<Student> students = studentDAO.findByLastName(lastName);
		for(Student student: students){
			System.out.println(student);
		}
	}

	private void getAllStudents(StudentDAO studentDAO){
		List<Student> students = studentDAO.findAll();
		for(Student student: students){
			System.out.println(student);
		}
	}

	private void createStudent(StudentDAO studentDAO) {
		// create a new student
		Student student = new Student("Jimmy","Deacon","jimmy.deacon@gmail.com");
		System.out.println("Saving: "+ student.toString());
		studentDAO.save(student);
		System.out.println("Saved Student with ID: "+student.getId());

		Student foundStudent = studentDAO.findById(student.getId());
		System.out.println(foundStudent.toString());
	}
}
