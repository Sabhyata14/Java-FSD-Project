package com.simplilearn.exception.bank;

public class Account {
    public int accno;
    public String name;
    public double balance;

    public Account() { }

    public Account(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }
}
