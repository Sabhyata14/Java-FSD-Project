package com.simplilearn.looselycoupled.bank;

public class BankApplication {
     private BankService bankService;

     BankApplication(BankService bankService){
         this.bankService = bankService;
     }

     public void bankInterest(String message, String customer){
         this.bankService.rateOfInterest(message, customer);
     }
}
