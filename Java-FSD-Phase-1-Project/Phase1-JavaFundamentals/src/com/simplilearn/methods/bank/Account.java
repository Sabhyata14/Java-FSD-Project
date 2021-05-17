package com.simplilearn.methods.bank;

public class Account {
	
	private double balance = 2984.23;
	private String name="Joe Smith";
	private String bankName ="XYZ Bank";
	
	
	// show balance
	public double showBalance() {
		System.out.println("User is :: "+name+" and Balance amount is :: "+ balance);
		return balance;
	}
	
	// withdraw amount
	public double withdraw(double amount) {
		if(amount< balance) {
			balance = balance - amount;
			System.out.println("User is :: "+name+" and Balance amount is :: "+ balance);
		} else {
			System.out.println("Invalid Withdraw Amount");
		}
		
		return balance;
	}
	
	// welcome message
		public void welcomeMessage() {
			System.out.println("-----------------------");
			System.out.println("Welcome to "+bankName);
			System.out.println("-----------------------");
		}
		
		//deposit amount
		public double deposit(double amount) {
			balance = balance + amount;
			System.out.println("User is :: "+name+" and Balance amount is :: "+ balance);
			return balance;
		}
}
