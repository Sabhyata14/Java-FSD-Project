package com.simplilearn.methods.bank;

public class BankOperation {

	public static void main(String[] args) {
		// create object
				Account account = new Account();
				
				account.welcomeMessage();
				
				double balance = account.showBalance();
				
				double withdrawBalance = account.withdraw(2002324);
				
				double depositmoney = account.deposit(2567);
				
				System.out.println("Result Balance :: "+ balance);
				System.out.println("Result New Balance :: "+ withdrawBalance);
				System.out.println("Result New Balance :: "+ depositmoney);

	}

}
