package com.simplilearn.strings;

public class StringDemo {
    public static void main(String[] args) {

        //string literal
        String str1 = "Hello";

        String str2 = "Hello";

        System.out.println("String 1:" + str1);
        System.out.println("String 2:" + str1);

        if (str1 == str2) {
            System.out.println("Same String:" + (str1 == str2));
        } else {
            System.out.println("Different String:" + (str1 == str2));
        }

        // String with new keyboard
        String str3 = new String("john Smith");

        String str4 = new String("john Smith");

        if(str3 == str4){
            System.out.println("Same String:" + (str3 == str4));
        } else {
            System.out.println("Different String:" + (str3 == str4));
        }
    }
}


