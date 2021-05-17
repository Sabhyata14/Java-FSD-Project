package com.simplilearn.accessmodifiers;

public class DefaultAccessModifiers {
	
	public static void main(String[] args) {
		
		Brother brother = new Brother();
		
		System.out.println("Money : "+brother.money);
		System.out.println("Clothes : "+brother.clothes);
		
		brother.showAll();
		
		
	}

}

class Brother {

	double money = 234;
	String clothes = "ABCD";
	
	void showAll() {
		System.out.println(" Money :: "+money +" Clothes "+clothes);
	}
}
