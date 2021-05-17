package com.simplilearn.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {

	public static void main(String[] args) {
		
		// step 1: user input -> collect user from console
		Scanner input = new Scanner(System.in);
		
		System.out.println("-----------------------------------------");
		System.out.println(":: Welcome to Numeric Data type Convertor ::");
		System.out.println(":: Enter a Integer number value ::");		
		System.out.println("-----------------------------------------");
		
		int userInput = input.nextInt();
		
		// step 2: convert values into different types
		
		long bigValue = userInput;
		float floatValue = userInput;
		double doubleValue = userInput;
		
		byte byteValue = (byte) userInput;
		short shortValue = (short) userInput;
		
		System.out.println("--------------------");
		System.out.println("Converted Type are");
		System.out.println("--------------------");
		
		System.out.println("Long Value ::"+bigValue);
		System.out.println("Float  Value :: "+floatValue);
		System.out.println("Double Value :: "+doubleValue);
		
		System.out.println("Byte Value :: "+byteValue);
		System.out.println("Short Value :: "+shortValue);

	}

}
