package com.simplilearn.exception.bank.exception;

//custom Exception
public class AccountNotFoundEx extends Exception{
    String message;

    public AccountNotFoundEx(String message){
        this.message = message;
    }
@Override
    public String toString(){
        return ":: AccountException ::" + message;
    }
}
