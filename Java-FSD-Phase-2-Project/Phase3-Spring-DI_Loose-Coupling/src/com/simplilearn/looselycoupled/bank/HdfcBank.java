package com.simplilearn.looselycoupled.bank;

public class HdfcBank implements BankService{

    private String bank = "HDFC";
    private double roi = 5.0;
    @Override
    public void rateOfInterest(String message, String customer) {

        System.out.println("Hello " +customer + ", the rate of interest of " + bank +" bank is " + roi + "%" +message + "\n");

    }
}
