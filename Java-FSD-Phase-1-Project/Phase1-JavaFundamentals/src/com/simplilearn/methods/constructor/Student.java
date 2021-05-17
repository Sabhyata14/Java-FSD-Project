package com.simplilearn.methods.constructor;

public class Student {

		// Id , name, marks
		// subject , class 
	int id;
	String name;
	double marks;
	String subject;
	String classes;
	
	Student(){}
	
	Student(int id){
		this.id = id;
	}
	
	Student(String name){
		this.name =name;
	}
	
	Student(int id, String name, double marks){
		this.id =id;
		this.name = name;
		this.marks = marks;
	}
	
	Student(String subject, String classes){
		this.subject=subject;
		this.classes =classes;
	}
	
	Student(int id, String name, double marks, String subject, String classes){
		this.id =id;
		this.name = name;
		this.marks = marks;
		this.subject=subject;
		this.classes =classes;
	}
	

}
