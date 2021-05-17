package com.simplilearn.typecasting;

import java.util.Scanner;

public class CalculatorTool {

	public static void main(String[] args) {

		// step 1: user input -> collect user from console
		Scanner input = new Scanner(System.in);

		System.out.println("-----------------------------------------");
		System.out.println(":: Welcome Arithmatic Calculator ::");
		System.out.println("-----------------------------------------");
		
		System.out.println(":: Enter a number1 value :: ");
		int number1 = input.nextInt();
		System.out.println(":: Enter a number2 value :: ");
		int number2 = input.nextInt();
		
		System.out.println("Addition :: " + add(number1,number2));
		System.out.println("Substraction :: "+sub(number1,number2));
		System.out.println("Multiplication :: "+mul(number1,number2));
		System.out.println("Division :: "+div(number1,number2));

	}
	
	public static byte add(int number1 , int number2) {
		return (byte) (number1 + number2);
	}
	
	public static double sub(int number1 , int number2) {
		return number1 - number2;
	}
	
	public static float div(int number1 , int number2) {
		return  number1 / number2;
	}
	
	public static short mul(int number1 , int number2) {
		return (short) (number1 * number2);
	}

}
