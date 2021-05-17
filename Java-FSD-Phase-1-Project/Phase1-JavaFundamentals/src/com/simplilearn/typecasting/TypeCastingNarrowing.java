package com.simplilearn.typecasting;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		
		/**
		 * Narrowing :-  Convert data from higher range to lower range value. 
		 * double -> float -> long -> int -> short -> byte.
		 */
		
		double doubleCount = 1098.67;
		
		float floatCount = (float) doubleCount; 
				
		long bigCount = (long) doubleCount;  // double to long conv. 
		
		int intCount = (int) bigCount;
		
		short shortCount = (short) intCount;
		
		byte byteCount = (byte) doubleCount;
		
		byte byteCount1 = (byte) intCount;
		
		System.out.println("Double Value :"+ doubleCount);
		System.out.println("Float Value :"+ floatCount);
		System.out.println("Long value :: "+bigCount);
		System.out.println("Integer value :: "+intCount);
		System.out.println("Short  value :: "+shortCount);
		System.out.println("Byte value :: "+byteCount);
		System.out.println("Byte value1 :: "+byteCount1);
	}

}
