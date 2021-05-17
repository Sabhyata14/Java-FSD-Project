package com.simplilearn.looselycoupled.bank;

public class IndusIndBank implements BankService{

    private String bank = "IndusInd";
    private double roi = 6.7;
    @Override
    public void rateOfInterest(String message, String customer) {

        System.out.println("Hello " +customer + ", the rate of interest of " + bank +" bank is " + roi + "%\n" +message + "\n");

    }
}
