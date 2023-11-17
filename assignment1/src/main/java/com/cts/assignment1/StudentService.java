package com.cts.assignment1;
import java.util.HashMap;

import java.util.Map.Entry;

import org.springframework.stereotype.Service;

@Service

public class StudentService {  
	
	
	public void CreateStudent(HashMap<Integer, Student> studentList) { 
		studentList.put( 1,new Student("Ajay",01, 90));
		studentList.put( 2,new Student("Balu",02, 80));
		studentList.put( 3,new Student("Catty",03, 70));
		studentList.put( 4,new Student("Dinesh",04, 50));
		System.out.println(studentList);
		}
	
	public void StudentsDetails(HashMap<Integer, Student> studentList) {
		System.out.println(studentList);
		}
	 
	
	public void StudentByKey(HashMap<Integer, Student> studentList) {
		Student studentdetails = studentList.get(1);
		System.out.println(studentdetails);
		}
	 
	
	public void UpdateStudent(HashMap<Integer, Student> studentList) {
		Student updatestudent = studentList.replace(1,new Student("Akilan",05,50) );
		System.out.println(updatestudent);
		System.out.println(studentList);
		ScoreSystem(studentList);
		}
	
	
	public void DeleteStudent(HashMap<Integer, Student> studentList) {
		Student deletedstudent = studentList.remove(3);
		System.out.println(studentList);
		
		}
	
	public void ScoreSystem(HashMap<Integer, Student> studentList) {
		for (Entry<Integer, Student> loop : studentList.entrySet()) {
			Student ii= loop.getValue();
			if (ii.getScore() <= 50) {
				System.out.println("the student is Below Average => " +ii);	
				}
			else if (ii.getScore() > 50 && ii.getScore() < 75) {
				System.out.println("the student is Average => " +ii);
				}
			else if (ii.getScore() > 75) {
				System.out.println("the student is Above Average => " +ii);
				}
			}
		}
	}


