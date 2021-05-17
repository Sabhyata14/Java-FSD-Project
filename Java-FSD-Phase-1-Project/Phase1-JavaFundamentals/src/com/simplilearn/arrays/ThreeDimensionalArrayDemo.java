package com.simplilearn.arrays;

import java.util.Arrays;

public class ThreeDimensionalArrayDemo {
    public static void main(String[] args) {

        //WAP Program for 3 dimensional array and iterate over
            int[][][] number3 = {
                    {
                        {10, 20, 30, 40}, {50, 60, 70, 80}
                        },
                    {
                        {1, 2, 3, 4}, {5, 6, 7, 8}
                        },
                    {
                        {11, 12, 13, 14}, {15, 16, 17, 18}
                        },
                    {
                        {11, 22, 33, 44}, {55, 66, 877, 88}
                    }
            };



        for(int table=0; table<number3.length;table++){
            for(int row=0; row<number3[row].length;row++){
                System.out.println("\nBlock " +(table+1) +":: " + Arrays.toString(number3[table][row]));
                for(int col=0; col<number3[table][row].length; col++){
                    System.out.println("Position:: [" + table + "][" + row + "][" + col + "] ==> " + number3[table][row][col]);
                }
            }
        }

    }

}
