package com.simplilearn.arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // arrays of integer type
        // array is homogeneous ordered data collection
        int number1[] = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(number1));
        System.out.println(number1[1]);

        // iteration
        for(int i =0; i<number1.length; i++)
        {
            System.out.println("Elements at index " +i + "::" + number1[i]);
        }

        //iteration for changing value.
        //change element 40 with 41

        for (int j=0; j<number1.length;j++){
            if(number1[j]==40) {
                number1[j] = 41;
                System.out.println("matched and changed number: " + number1[j]);
                break;
            }
        }
        System.out.println(Arrays.toString(number1));

        int[] number2 = {20,30,40,50,60};

    }
}
