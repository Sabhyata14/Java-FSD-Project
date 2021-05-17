package com.simplilearn.accessmodifiers;

import com.simplilearn.accessB.Hero;

public class ProtectedAccessModifiersTest2 extends Hero {

	public static void main(String[] args) {
		
		// create object
		ProtectedAccessModifiersTest2 hero = new ProtectedAccessModifiersTest2();
		
		// print variables
		System.out.println("Power :" + hero.power);
		
		//methods	
		hero.usePower();
		hero.showPower();
		

	}

}
