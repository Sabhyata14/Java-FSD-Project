package com.simplilearn.typecasting;

public class StringToNumberConvertor {
	
	public static void main(String[] args) {
		
		// String to Numeric Conversion : The String value should be a convertible value.
		
		String price = "124"; // convertible value
		//String amount = "124abc";  // non-convertible value
		String amount = "124678";
		
		//convert to float
		float floatPrice = Float.parseFloat(price);
		
		//convert to double
		double doubleAmount = Double.parseDouble(amount);
		
		// convert to int
		int priceInt = Integer.parseInt(price);
		
		// convert to byte
		byte priceByte = Byte.parseByte(price);
		
		System.out.println("Floating Price :: "+floatPrice);
		System.out.println("Double Amount :: "+doubleAmount);
		System.out.println("Integer Price :: "+priceInt);
		System.out.println("Byte Price :: "+priceByte);
		
		
	}

}
