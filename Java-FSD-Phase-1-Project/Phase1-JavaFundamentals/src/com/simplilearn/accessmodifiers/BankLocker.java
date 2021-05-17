package com.simplilearn.accessmodifiers;

import com.simplilearn.accessB.BankVisionClass;

public class BankLocker extends BankVisionClass{

	public static void main(String[] args) {
		// TODO :: WAP for all access modifier
		// private -> accountNo , accountPin
		// public -> bankName, bankAssets
		// protected -> bankVision
		// default ->  customerCount ,customerNos.
		// add methods to access properties.
		
		Bank bank = new Bank();
		
		BankLocker bankv = new BankLocker();
		
		System.out.println("Private Access Modifiers Bank Details \n");
		
		bank.showAccount();
		System.out.println("\nDisplay account Number:"+bank.showAccountNo() +"");
		
		System.out.println("Public Access Modifiers Bank Details");
		
		System.out.println("Bank Details ::\n" + "Bank Name ::"+bank.bankName + 
				"\n" + "Bank Assets ::"+bank.bankAssets +"\n\n");
		
		System.out.println("Public Access Modifiers Bank Details");
		
		System.out.println("Customer Details ::\n" + "Customer Count ::"+bank.customerCount + 
				"\n" + "Customer Number ::"+bank.customerNos+"\n\n");
		
		System.out.println("Protected Access Modifiers Bank Details");
		System.out.println("Bank Vision Details:" + bankv.bankVisionMethod());
	}

}

class Bank{
	private int accountNo = 23455;
	private int accountPin = 8765;
	
	public String bankName = "HDFC Pvt Ltd.";
	public int bankAssets = 675;
	
	int customerCount = 54;
	int customerNos = 34;
	
	public int showAccountNo() {
		return accountNo;
	}
	
	public void showAccount() {
		System.out.println("Account Number :" +accountNo +"\n" +"Account Pin:" + accountPin);
	}
	
	
}
