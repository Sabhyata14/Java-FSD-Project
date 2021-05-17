package com.simplilearn.exception;

public class ExceptionWithMethods2 {
    public static void main(String[] args) {
        //calling method
//        transaction(20);
//        transaction(0);
//        transaction(100);

//        stringLengthCalculator("Hello Welcome");
//        stringLengthCalculator(null);
//        stringLengthCalculator("Hello Sabhyata");

//        numberConvertorToInt("100");
//        numberConvertorToInt("100abc");
//        numberConvertorToInt("1233");

        try {
            multiTask2("John Smith", 20); /// Number format Exception
        } catch (Exception e) {
            System.out.println("Exception Ocuurs :: " + e.getClass());
            System.out.println("Exception Message :: " + e.getMessage());
        }

        multiTask2("1002", 10); /// Arithmetic Exception
        multiTask2("123", 10); /// Arithmetic Exception

    }

    public static void transaction(int amount){
        try {
            int balance = 2000;
            float response = balance / amount;
            System.out.println("Response ::" + response);
        } catch (ArithmeticException e){
            System.out.println("Exception Occurs::" +e.getClass());
            System.out.println("Exception Occurs::" +e.getMessage());
        }
    }

    public static void stringLengthCalculator(String str){
        try {
            int response = str.length();
            System.out.println("Response ::" + response);
        } catch (NullPointerException e){
            System.out.println("Exception Occurs::" +e.getClass());
            System.out.println("Exception Occurs::" +e.getMessage());
        }
    }

    public static void numberConvertorToInt(String str){
        try {
            int response = Integer.parseInt(str);
            System.out.println("Response ::" + response);
        } catch (NumberFormatException e){
            System.out.println("Exception Occurs::" +e.getClass());
            System.out.println("Exception Occurs::" +e.getMessage());
        }
    }

    public static void multiTask(int amount, String str){
        try {
            int response1 = 2000 / amount;
            int response2 = str.length();
            int response3 = Integer.parseInt(str);

            System.out.println("Response1 ::: " + response1);
            System.out.println("Response2 ::: " + response2);
            System.out.println("Response3 ::: " + response3);
        } catch (ArithmeticException e){
            System.out.println("Exception Occurs::" +e.getClass());
            System.out.println("Exception Occurs::" +e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Exception Occurs::" +e.getClass());
            System.out.println("Exception Occurs::" +e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Exception Occurs::" +e.getClass());
            System.out.println("Exception Occurs::" +e.getMessage());
        }
    }
    public static void multiTask2(String str, int number) {

        try {
            int response1 = 2000 / number;
            int response2 = str.length();
            int response3 = Integer.parseInt(str);

            System.out.println("Response1 ::: " + response1);
            System.out.println("Response2 ::: " + response2);
            System.out.println("Response3 ::: " + response3);
        } finally {
            System.out.println("Always execute");
        }
    }
}
