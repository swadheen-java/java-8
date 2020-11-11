package com.learn.ds.sort;

public class InsertionSortExample {

    public static void main(String[] args) {

        int[] arr = {22,7,35,-21,-15,1};

        for(int i = 0; i < arr.length-1; i++){
            int indexUnsortedArray = 1;
            for(int j = 1; j < indexUnsortedArray; j++){
                //if(arr[i] > arr[j])
            }
        }

        for(int x = 0; x < arr.length-1; x++){
            System.out.println(arr[x]);
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
