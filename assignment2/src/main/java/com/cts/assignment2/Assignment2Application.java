package com.cts.assignment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Assignment2Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment2Application.class, args);
	}
	
	@Bean
	public Book bk()
	{
		return new Book("Innovation","Akil");
		
	}
	
	@Bean
	public Library lib(Book bk)
	{
		return new Library(bk);
		
	}
	
	@Bean
	public Student stdt()
	{
		return new Student("Akil",22);
		
	}
	
	@Bean
	public Classroom cr(Student stdt)
	{
		return new Classroom();
		
	}

}
