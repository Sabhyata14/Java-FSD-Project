package com.simplilearn.methods;

public class TestCalculator {

	public static void main(String[] args) {
		// use this as caller method
		TestCalculator.showMessage(); // static method called by using class name as all methods defined in same class
		
		// call function with argument
		displayAuthor("John Smith"); // static method called directly (methods defined in same class)
		
		// call add function
		add(100,200);
		
		// call sub 
		sub(200,100,"Substraction");
		
		//call mul
		mul (20,20,"Multiplication");
		
		//call div
		div(100,20,"Division");
	}

	// access modifier return-type identifier () { --- body --- }

	// zero parameterized function
	public static void showMessage() {
		System.out.println("::: Welcome to Test calculator ::: ");
	}
	
	// one parameterized function
	public static void displayAuthor(String name) {
		System.out.println("::: @Author:- "+ name+" @Email:- waheed@---.com ::: ");
	}

	// two parameterized function
	public static void add(int num1, int num2) {
		float result = num1+num2;
		System.out.println("Addition  :: "+result);
	}
	
	// three parameterized function for subtraction
	public static void sub(int num1, int num2, String action) {
		float result = num1-num2;
		System.out.println(action + " :: "+result);
	}
	
	// TODO :: WA method for mul and division with 3 input params
	
	// three parameterized function for multiplication
	public static void mul(int num1, int num2, String action) {
		int result = num1*num2;
		System.out.println(action + " :: "+result);
	}
	
	// three parameterized function for division
	public static void div(int num1, int num2, String action) {
		float result = num1/num2;
		System.out.println(action + " :: "+result);
	}

}
