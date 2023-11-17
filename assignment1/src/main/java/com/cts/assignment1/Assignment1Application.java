package com.cts.assignment1;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> studentList = new HashMap<Integer, Student>();
		StudentService studentService = new StudentService();
		studentService.CreateStudent(studentList);
		studentService.StudentsDetails(studentList);
		studentService.StudentByKey(studentList);
		studentService.UpdateStudent(studentList);
		}
	}
		