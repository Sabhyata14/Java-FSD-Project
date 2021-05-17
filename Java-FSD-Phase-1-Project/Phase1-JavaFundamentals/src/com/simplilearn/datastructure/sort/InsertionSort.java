package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] inputs = { 20, 35 , -11 , 7 , 65 , 1, -22};
        System.out.println("Before : " + Arrays.toString(inputs));
        insertionSort(inputs);
        System.out.println("After : " + Arrays.toString(inputs));
    }

    public static void insertionSort (int[] input){

        for(int firstUnSortedIndex =1; firstUnSortedIndex< input.length; firstUnSortedIndex++){
           int element = input[firstUnSortedIndex];
            int i;
            for (i =firstUnSortedIndex; i > 0 && input[i-1]>element;i--){
                input[i]=input[i-1];
            }
            input[i]=element;
        }

    }
}
