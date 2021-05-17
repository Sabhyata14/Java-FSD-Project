package com.simplilearn.looselycoupled.bank;

public class ICICIBank implements BankService{

    private String bank = "ICICI";
    private double roi = 4.0;
    @Override
    public void rateOfInterest(String message, String customer) {

        System.out.println("Hello " +customer + ", the rate of interest of " + bank +" bank is " + roi + "%\n" +message +"\n");

    }
}
