package com.simplilearn.strings;

public class StringBufferDemo {
    public static void main(String[] args) {

        // String Buffer will create a mutable String.
        StringBuffer str = new StringBuffer("today is good day");

        System.out.println(str);

        str.append(" Enjoy your Learning ");
        System.out.println(str);

        str.replace(2,6,"DAYISer");
        System.out.println(str);

        str.delete(2,4);
        System.out.println(str);

    }
}
