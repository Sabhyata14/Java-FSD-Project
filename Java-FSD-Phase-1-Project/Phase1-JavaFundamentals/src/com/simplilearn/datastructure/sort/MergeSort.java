package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] inputs = { 20, 35, -11, 7, 65, 1, -22 };
        System.out.println("Before : " + Arrays.toString(inputs));
        mergeSort(inputs,0,inputs.length);
        System.out.println("After : " + Arrays.toString(inputs));

    }

    public static void mergeSort(int[] inputs, int start, int end){

        //break logic for breaking recursion
        if(end-start <2){
            return;
        }

        // 1. Divide array element
        int mid = (start+end)/2;

        //call mergesort for first half
        mergeSort(inputs, start, mid);

        //call mergesort for first half
        mergeSort(inputs, mid, end);

        // 2. call Merge
        merge(inputs, start, mid, end);
    }

    private static void merge(int[] inputs, int start, int mid, int end) {

        if(inputs[mid-1]<=inputs[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];

        while (i < mid && j <end){
            temp[tempIndex++] = (inputs[i] <= inputs[j]) ? inputs[i++] : inputs[j++];
        }

        // copy element from temp array to actual inputs array
        System.arraycopy(inputs, i, inputs, start+tempIndex,mid-i);
        System.arraycopy(temp, 0, inputs, start, tempIndex);


    }


}
