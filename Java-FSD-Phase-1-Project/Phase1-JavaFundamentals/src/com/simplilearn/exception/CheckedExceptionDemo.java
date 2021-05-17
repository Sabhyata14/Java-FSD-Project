package com.simplilearn.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        //checked exception : exception which are verified at compile time
        try{
            FileReader file = new FileReader("file.ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
