package com.simplilearn.accessmodifiers;

public class PublicAccessModifiersTest {

	public static void main(String[] args) {
		
		Mother mother = new Mother();
		
		// access variable
		System.out.println("Money :" +mother.bankMoney);
		System.out.println("Gold :" +mother.gold);
		
		System.out.println("Money Method :::"+ mother.showMoney());
		mother.showAll();
		

	}

}

class Mother {
	
	// public variable
		public double bankMoney = 456465;
		public double gold = 10;
		
		
		// public methods
		public double showMoney() {
			return bankMoney;
		}
		
		public void showAll() {
			System.out.println("Money ::: "+bankMoney +"   Gold value  :: "+ gold);
		}
}

