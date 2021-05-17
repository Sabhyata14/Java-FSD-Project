package com.simplilearn.methods.constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.id = 1011;
		emp.name = "John Smith";
		 
		System.out.println("Employee Id:" + emp.id);
		System.out.println("Employee Id:" +emp.name);
		System.out.println("------------------------------------------");

		// create employee with id
		Employee emp2 = new Employee(1022);
		System.out.println("Employee Id:" + emp2.id);
		System.out.println("Employee Id:" +emp2.name);
		System.out.println("------------------------------------");
		
		// create employee with id
		Employee emp3  = new Employee("Iron Man");
		System.out.println("Employee Id :: "+emp3.id);
		System.out.println("Employee Name :: "+emp3.name);		
		System.out.println("------------------------------------");
		
		// create employee with id and name
		Employee emp4 = new Employee(1033,"Sam Jesus");
		System.out.println("Employee Id:" + emp4.id);
		System.out.println("Employee Id:" +emp4.name);
		System.out.println("Employee Id:" +emp4.dept);
	}

}

class Employee {
	int id;
	String name;
	String dept;
	
	//zero args / no params / default constructor
	
	Employee(){}
	
	// Parameterized constructor 
	Employee(int id){
		this.id = id;
	}
	
	Employee(String name){
		this.name= name;
	}
	
	Employee(int id, String name){
		this.id= id;
		this.name = name;
		this.dept = "Engineering";
	}
	// this -> this keyword refers to the current object in method or custructor.
}
