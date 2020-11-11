package com.learn.ds.sort;

public class MainSample {
    public static void main(String[] args) {
        int[] arr = new int[9];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 0;
        arr[3] = 2;
        arr[4] = 10;
        arr[5] = -1;
        arr[6] = -3;
        arr[7] = 7;
        arr[8] = 9;





        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }

        for( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
