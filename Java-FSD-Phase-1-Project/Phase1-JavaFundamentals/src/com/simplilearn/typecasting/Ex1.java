package com.simplilearn.typecasting;

public class Ex1 {

	public static void main(String[] args) {
		// TODO :: WAP for converting int byte and short ->  Float, Double Long.
		
		int intValue = 100;
		float intToFloat = intValue;
		double intToDouble = intValue;
		long intToLong = intValue;
		
		byte byteValue = 45;
		float byteToFloat = byteValue;
		double byteToDouble = byteValue;
		long byteToLong = byteValue;
		
		short shortValue = 1;
		float shortToFloat = shortValue;
		double shortToDouble = shortValue;
		long shortToLong = shortValue;
		
		System.out.println("Conversion of Int to Float, Double, Long");
		System.out.println("Integer Value :" + intValue);
		System.out.println("Int to Float :" + intToFloat);
		System.out.println("Int to Double :" + intToFloat);
		System.out.println("Int to Long :" + intToFloat);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Conversion of byte to Float, Double, Long");
		System.out.println("Byte Value :" + byteValue);
		System.out.println("Byte to Float :" + byteToFloat);
		System.out.println("Byte to Double :" + byteToDouble);
		System.out.println("Byte to Long :" + byteToLong);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Conversion of short to Float, Double, Long");
		System.out.println("Short Value :" + shortValue);
		System.out.println("Short to Float :" + shortToFloat);
		System.out.println("Short to Double :" + shortToDouble);
		System.out.println("Short to Long :" + shortToLong);
		

	}

}
