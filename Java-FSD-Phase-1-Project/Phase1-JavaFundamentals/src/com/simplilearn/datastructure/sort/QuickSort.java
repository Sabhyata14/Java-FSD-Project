package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] inputs = { 20, 35, -11, 7, 65, 1, -22 };
        System.out.println(" :: Quick Sort :: ");
        System.out.println("Before :- " + Arrays.toString(inputs));

        quickSort(inputs,0,inputs.length);

        System.out.println("After :- " + Arrays.toString(inputs));
    }

    public static void quickSort(int[] inputs, int start, int end) {
        // break logic for breaking recursion
        if (end - start < 2) {
            return;
        }

        // create partition based on pivot
        int pivotIndex = partition(inputs, start, end);

        // call quickSort for first half
        quickSort(inputs, start, pivotIndex);

        // call quickSort for second half
        quickSort(inputs, pivotIndex + 1, end);

    }

    private static int partition(int[] inputs, int start, int end) {

        int pivot = inputs[start];

        int i = start;
        int j = end;

        while (i < j) {

            // empty body while for element greater then pivot
            while (i < j && inputs[--j] >= pivot);

            if (i < j) {
                inputs[i] = inputs[j];
            }

            // empty body while for element less then pivot
            while (i < j && inputs[++i] <= pivot);

            if (i < j) {
                inputs[j] = inputs[i];
            }

        }
        inputs[j] = pivot;
        return j;
    }
}
