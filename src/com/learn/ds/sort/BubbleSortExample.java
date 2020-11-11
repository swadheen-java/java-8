package com.learn.ds.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BubbleSortExample {

    public static void main(String[] args) {
        //int k = 0;
         int[] unsortedArray = new int[5];

         for(int i = 0; i < unsortedArray.length-1; i++){
             unsortedArray[i] = new Random().nextInt(100);

         }

         for(int k = unsortedArray.length-1; k > 0 ; k--){
             for (int l = 0; l < k; l++){
                 if(unsortedArray[l] >  unsortedArray[l+1]){
                     swap(unsortedArray, l, l+1);
                 }
             }
         }



//        System.out.println(k);
         for(int i = 0; i < unsortedArray.length; i++){
             System.out.println(unsortedArray[i]);
         }



//         // this works on String but does not work in primitive types such as int
//        String[] array = {"a", "b", "c", "d", "e"};
//        List<String> list = Arrays.asList(array);
//        list.forEach(x-> System.out.println(x));
//
//        // for primitive type it does not work
//        List<Integer> arr =  Arrays.asList(unsortedArray);
//        arr.forEach(x-> System.out.println(x));

    }

    public static void swap(int[] array, int i, int j){
        if(i==j){ return;}
         int temp =  array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
