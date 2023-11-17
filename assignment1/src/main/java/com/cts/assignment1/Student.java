package com.cts.assignment1;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String Name;  
	private int Id;  
	private int Score;
	
	public Student() {
		
	}
	
	public Student(String name,int id,int score) {
		this.Name = name;
		Id = id;
		Score = score;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		this.Score = score;
	}

	@Override
	public String toString() {
		
		return Name +" "+ Id +" "+ Score;
	}
	
	
}
	
	
	
	


