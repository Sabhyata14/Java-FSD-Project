package com.simplilearn.strings;

public class StringCompare {

    public static void main(String[] args) {
        // compareTo  -> compareTo method return int value after comp.
        // this integer value will specify the string are equal(0) or
        // string less then other string or greater

        String str1 = "John";
        String str2 = "Mike";
        String str3 = "John";

        int result1 = str1.compareTo(str2);
        System.out.println("Result1 :: "+result1);  // return -3 because str1 < str2

        int result2 = str1.compareTo(str3);
        System.out.println("Result2 :: "+result2);  // return 0 because str1 == str3

        int result3 = str2.compareTo(str3);
        System.out.println("Result3 :: "+result3);  // return 3 because str2 > str3


    }

}