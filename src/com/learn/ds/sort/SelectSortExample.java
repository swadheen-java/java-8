package com.learn.ds.sort;

public class SelectSortExample {

    public static void main(String[] args) {
        int[] unsortedA = {12,10, 13, 1, 5};
        int k = 1;

        for(int unsortedIndex = unsortedA.length-1; unsortedIndex > 0; unsortedIndex--){
            int max = 0;
            for(int i = 1; i < unsortedIndex; i++){
                if(unsortedA[i] > unsortedA[max]){
                    max = i;
                }
            }
            swap(unsortedA, max, unsortedIndex);
        }

        for(int x = 0; x < unsortedA.length-1; x++){
            System.out.println(unsortedA[x]);
        }

    }

    public static void swap(int[] arr, int x, int y){
        if(x==y)
            return;

        if(arr[x] > arr[y]){
            int temp = arr[x];
            arr[x] =  arr[y];
            arr[y] = temp;
        }
    }


}
