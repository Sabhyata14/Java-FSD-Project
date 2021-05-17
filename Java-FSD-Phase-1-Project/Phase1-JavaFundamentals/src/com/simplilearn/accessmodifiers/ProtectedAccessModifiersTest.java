package com.simplilearn.accessmodifiers;

public class ProtectedAccessModifiersTest {

	public static void main(String[] args) {
		
		// create object
		Hero hero = new Hero();
		
		// print variables
		System.out.println("Power :" + hero.power);
		
		//methods	
		//hero.usePower();
		hero.showPower();
		

	}

}
