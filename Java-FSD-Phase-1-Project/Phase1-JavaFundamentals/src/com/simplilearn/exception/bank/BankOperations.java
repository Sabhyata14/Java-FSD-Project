package com.simplilearn.exception.bank;

import com.simplilearn.exception.bank.exception.AccountNotFoundEx;
import com.simplilearn.exception.bank.exception.TransactionException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankOperations {
    public static void main(String[] args) {

        //Account acc = new Account(101, "John Smith", 2345.78);
        //bank account list
        List<Account> accounts = new ArrayList<Account>();
        accounts.add(new Account(101, "John Smith", 2345.78));
        accounts.add(new Account(102, "Will Smith", 1845.78));
        accounts.add(new Account(103, "Sam Smith", 8345.78));
        accounts.add(new Account(104, "Thonas Smith", 945.78));

        //user interaction in console
        Scanner in = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println(":: Welcome to Hero Bank ::");
        System.out.println("-------------------------");
        System.out.println(":: Enter Your Account No. ::");
        int accinput = in.nextInt();
        System.out.println(":: Choose \n 1. Show balance\n 2. Deposit\n 3. Withdraw");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                showBalance(accinput,accounts);
                break;

            case 2:
                System.out.println(":: Enter Deposit Amount. ::");
                int amt = in.nextInt();
                depositAmount(accinput,accounts,amt);
                break;

            case 3:
                System.out.println(":: Enter Withdraw Amount. ::");
                int wamt = in.nextInt();
                withdrawAmount(accinput,accounts,wamt);
                break;

            default:
                break;

        }


    }

    //showBalance
    public static void showBalance(int accountno, List<Account> accounts) {
        try {
            int count = 0;
            for (Account acc : accounts) {
                if (acc.accno == accountno) {
                    System.out.println("The Account '" + acc.accno + "' has Balance amount is : " + acc.balance);
                    count++;
                }
            }
            if (count == 0) {
                throw new AccountNotFoundEx("Account doesn't Exist with account number :" + accountno);
            }

        } catch (AccountNotFoundEx e) {
            System.out.println("Failed to load Account Balance" + accountno);
            System.out.println(e.toString());
        }
        System.out.println("End of the Transaction");
    }

    // deposit amount
    public static void depositAmount(int accountno, List<Account> accounts, double depositAmount) {
        try {
            int count = 0;
            for (Account acc : accounts) {
                if (acc.accno == accountno) {
                    System.out.println("Before :: The Account '" + acc.accno + "' user '" + acc.name + "' has Balance Amount is "
                            + acc.balance);

                    //deposit
                    if (depositAmount <= 0 || depositAmount > 1000000) {
                        throw new TransactionException("Invalid Deposit Amount min=1 and max= 1000000", "400");
                    }
                    acc.balance = acc.balance + depositAmount;
                    System.out.println("After :: The Account '" + acc.accno + "' user '" + acc.name + "' has Balance Amount is "
                            + acc.balance);
                    count++;
                }
            }
            if (count == 0) {
                throw new AccountNotFoundEx("Account doesn't Exist with account number :" + accountno);
            }

        } catch (AccountNotFoundEx e) {
            System.out.println("Failed to execute Transaction " + accountno);
            System.out.println(e.toString());
        }catch (TransactionException e) {
            System.out.println("Failed to execute Transaction " + accountno);
            e.printError();
        }
        System.out.println("End of Transaction !");
    }

    // deposit amount
    public static void withdrawAmount(int accountno, List<Account> accounts, double withdrawAmount) {
        try {
            int count = 0;
            for (Account acc : accounts) {
                if (acc.accno == accountno) {
                    System.out.println("Before :: The Account '" + acc.accno + "' user '" + acc.name + "' has Balance Amount is "
                            + acc.balance);

                    //deposit
                    if (withdrawAmount <= 0 || withdrawAmount > 100000) {
                        throw new TransactionException("Invalid Withdraw Amount min=1 and max= 100000","400");
                    }
                    acc.balance = acc.balance - withdrawAmount;
                    System.out.println("After :: The Account '" + acc.accno + "' user '" + acc.name + "' has Balance Amount is "
                            + acc.balance);
                    count++;
                }
            }
            if (count == 0) {
                throw new AccountNotFoundEx("Account doesn't Exist with account number :" + accountno);
            }

        } catch (AccountNotFoundEx e) {
            System.out.println("Failed to execute Transaction " + accountno);
            System.out.println(e.toString());
        }catch (TransactionException e) {
            System.out.println("Failed to execute Transaction " + accountno);
            e.printError();
        }
        System.out.println("End of Transaction !");
    }
}
