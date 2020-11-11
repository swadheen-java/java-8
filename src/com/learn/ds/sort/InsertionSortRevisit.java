package com.learn.ds.sort;

import java.util.Random;

public class InsertionSortRevisit {

    public static void main(String[] args) {
        int[] arr = {10,5,2,9,90,77,23,11};

        for(int i = arr.length-1; i > 0; i--){
            int largest = 0;
           for(int j = 1; j <= i; j++){
               if(arr[j] > arr[largest]){
                   largest = j;
               }
           }
           swap(arr, largest, i);
        }

        for(int i = 0;  i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void swap(int[] arr, int i, int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] =  temp;
    }
}
