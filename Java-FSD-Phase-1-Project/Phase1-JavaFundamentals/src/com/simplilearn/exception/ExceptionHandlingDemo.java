package com.simplilearn.exception;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        System.out.println("Program Initiated !");
        // unchecked exception : which occurs at runtime

        try {
            int balance  = 2000;
            int amount  = 0;

            int res = balance / amount;
        } catch (ArithmeticException e) {
            System.out.println("Exception Occurs :: "+e.getClass());
        } finally {
            System.out.println("finally always excute .. ");
        }


        System.out.println("Program Completed !");
    }
}
