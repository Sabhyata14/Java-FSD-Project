package com.simplilearn.looselycoupled.bank;

public class Test {
    public static void main(String[] args) {

        BankApplication bank1 = new BankApplication(new SBIBank());
        bank1.bankInterest("Happy to serve you !!!", "Sabhyata");

        BankApplication bank2 = new BankApplication(new IndusIndBank());
        bank2.bankInterest("Excited to serve you !!!", "Sudha");

        BankApplication bank3 = new BankApplication(new HdfcBank());
        bank2.bankInterest("Delighted to serve you !!!", "Rahul");

        BankApplication bank4 = new BankApplication(new ICICIBank());
        bank2.bankInterest("Happy ans Excited to serve you !!!", "Lokesh");
    }
}
