package com.simplilearn.strings;

public class StringExample {
    public static void main(String[] args) {

        String bankName = "Apna Bank";

        System.out.println(bankName);
        System.out.println("String length :" + bankName.length()); //string length

        //substring
        System.out.println("Substring from String from 2 : " +bankName.substring(2));
        System.out.println("substring from 2 to 4: " +bankName.substring(2,5));

        //String Comparison
            // 1. by using equals()
            // 2. by using == operator
            // 3. by using compareTo()

        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("John Smith");
        String str4 = new String("John Smith");

        System.out.println("\nstr1 = " + str1 + "\nstr2 = " + str2);
        System.out.println("\nstr3 = " + str3 + "\nstr4 = " + str4);

        // .equals() => it compares the contents of strings
        System.out.println("\nResult of equals()" );
        System.out.println("  str1 and str2 : " + str1.equals(str2));
        System.out.println("  str3 and str4 : " + str3.equals(str4));
        System.out.println("  str1 and str3 : " + str1.equals(str3));

        // == => it compares the object reference/address of strings
        System.out.println("\nResult of == operator" );
        System.out.println("  str1 and str2 : " + (str1 == str2));
        System.out.println("  str3 and str4 : " + (str3 == str4));
        System.out.println("  str1 and str3 : " + (str1 == str3));

        // compareTo() => it return int value after comparison
        //this integer value will specify the string are equal(0) or string less than or greater than other string
        System.out.println("\nResult of compareTo()");
        System.out.println("  str1 and str2 : " + str1.compareTo(str2));
        System.out.println("  str3 and str4 : " + str3.compareTo(str4));
        System.out.println("  str1 and str3 : " + str1.compareTo(str3));

    }
}
