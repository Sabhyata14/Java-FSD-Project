package com.simplilearn.methods.constructor;

public class StudentTest {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.id = 101;
		st1.name = "system1";
		st1.marks = 10.8;
		st1.subject = "Hindi";
		st1.classes = "1A";
		
		System.out.println("Student Id:" + st1.id);
		System.out.println("Student name:" + st1.name);
		System.out.println("Student marks:" + st1.marks);
		System.out.println("Student name:" + st1.subject);
		System.out.println("Student marks:" + st1.classes);
		System.out.println("------------------------------");
		
		Student st2 = new Student(102);
		System.out.println("Student Id:" + st2.id);
		System.out.println("Student name:" + st2.name);
		System.out.println("Student marks:" + st2.marks);
		System.out.println("Student name:" + st2.subject);
		System.out.println("Student marks:" + st2.classes);
		System.out.println("------------------------------");
		
		Student st3 = new Student("System 2");
		System.out.println("Student Id:" + st3.id);
		System.out.println("Student name:" + st3.name);
		System.out.println("Student marks:" + st3.marks);
		System.out.println("Student name:" + st3.subject);
		System.out.println("Student marks:" + st3.classes);
		System.out.println("------------------------------");
		
		Student st4 = new Student(103,"System 3",34.78);
		System.out.println("Student Id:" + st4.id);
		System.out.println("Student name:" + st4.name);
		System.out.println("Student marks:" + st4.marks);
		System.out.println("Student name:" + st4.subject);
		System.out.println("Student marks:" + st4.classes);
		System.out.println("------------------------------");
		
		Student st5 = new Student(104,"System 4",34.78,"English","10A");
		System.out.println("Student Id:" + st5.id);
		System.out.println("Student name:" + st5.name);
		System.out.println("Student marks:" + st5.marks);
		System.out.println("Student name:" + st5.subject);
		System.out.println("Student marks:" + st5.classes);
		System.out.println("------------------------------");
		
	}

}
