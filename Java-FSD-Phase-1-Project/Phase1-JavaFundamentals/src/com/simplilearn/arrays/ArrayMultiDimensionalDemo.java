package com.simplilearn.arrays;

import java.util.Arrays;

public class ArrayMultiDimensionalDemo {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40, 50, 60},
                {1, 2, 3, 4, 5, 6}
        };

        //System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(Arrays.toString(numbers[1]));

        System.out.println("Value :: => " + numbers[0][2]);
        System.out.println("Value :: => " + numbers[1][3]);

        for (int row = 0; row < numbers.length; row++) {
            System.out.println("\nRow :: " + Arrays.toString(numbers[row]));
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.println("Position:: [" + row + "," + col + "] ==> " + numbers[row][col]);
            }
        }
    }

}
