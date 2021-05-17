package com.simplilearn.looselycoupled.bank;

public class SBIBank implements BankService{

    private String bank = "SBI";
    private double roi = 5.4;
    @Override
    public void rateOfInterest(String message, String customer) {

        System.out.println("Hello " +customer + ", the rate of interest of " + bank +" bank is " + roi + "%\n" +message + "\n");

    }
}
