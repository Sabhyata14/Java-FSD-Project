package com.simplilearn.exception.bank.exception;

public class TransactionException extends Exception{
    String message;
    String status;

    public TransactionException(String message, String status){
        this.message = message;
        this.status =status;
    }

    public void printError(){
        System.out.println("Exception occurs with message  ::" +message +"\n Status Code::" +status);
    }
}
