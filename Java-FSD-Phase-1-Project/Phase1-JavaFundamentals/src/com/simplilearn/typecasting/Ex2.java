package com.simplilearn.typecasting;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO :: WAP for converting a string value taken from user input to all numeric type
				// int , float , double , byte short etc.
		
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("String to Numeric Convertor");
		System.out.println("Enter a Number string value");
		
		String inputString = input.nextLine();
		
		int intValue = Integer.parseInt(inputString);
		
		float floatValue = Float.parseFloat(inputString);
		
		double doubleValue = Double.parseDouble(inputString);
		
		byte byteValue = Byte.parseByte(inputString);
		
		short shortValue = Short.parseShort(inputString);
		
		System.out.println("Integer Value :: "+ intValue);
		System.out.println("Float Value :: "+ floatValue);
		System.out.println("Double Value :: "+ doubleValue);
		System.out.println("Byte Value :: "+ byteValue);
		System.out.println("Short Value :: "+ shortValue);

	}

}
