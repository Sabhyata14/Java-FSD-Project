package com.simplilearn.strings;

public class StringImmutable {
    public static void main(String[] args) {

        // String are immutable in java
        // -> One we create string in java it will not allowed to modify
        // -> If we modify the string it will create  new string.

        String str1 = "Hello";

        String str2 = str1.concat(" Java String");

        System.out.println("String before Concatenation :" +str1 );

        System.out.println("String before Concatenation :" +str2 );
    }
}
