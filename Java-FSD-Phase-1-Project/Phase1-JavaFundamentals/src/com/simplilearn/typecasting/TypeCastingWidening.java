package com.simplilearn.typecasting;

public class TypeCastingWidening {

	public static void main(String[] args) {
		// Type Casting :-  process of converting data from one type to another type.
		
		/**
		 *  Widening Type Casting :- Converts data from lower range to higher range value
		 *  byte -> short -> int -> long -> float -> double.
		 *  
		 */	
		
		byte byteCount = 100; // -128 to 127 ; 1 byte = 8 bit
		
		short shortCount = byteCount; // byte -> short
		
		int intCount = shortCount;  // short -> Int
		
		long bigCount = intCount; //  Int -> Long
		 
		float floatCount = bigCount; // long to float 
		 
		double decimalCount = bigCount; // long to double
		
		System.out.println("ByteCount:" + byteCount);
		System.out.println("ShortCount:" + shortCount);
		System.out.println("Integer Count "+intCount);
		System.out.println("Long Count "+bigCount);
		 System.out.println("Float Count "+floatCount);
		 System.out.println("Decimal Count "+decimalCount);

	}

}
