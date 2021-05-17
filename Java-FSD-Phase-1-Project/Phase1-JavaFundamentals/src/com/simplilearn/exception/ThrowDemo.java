package com.simplilearn.exception;

public class ThrowDemo {
    public static void main(String[] args) {

        // throw :: throw keyword is used to throw an exception.
//        ageValidator(35);
//        ageValidator(10);
//        ageValidator(25);

        stringValidator("saby");
        stringValidator(null);
        stringValidator("");

    }

    public static void ageValidator(int age){
        if(age>18){
            System.out.println("Your Age is valid age :: Welcome onboard !");
        } else {
            throw new RuntimeException("not a Valid Age");
        }
    }

    public static void stringValidator(String str){
        if(str != null && !(str.equals(""))) {
            System.out.println("Valid String....");
        } else {
            throw new RuntimeException("Not a valid String");
        }
    }
}
