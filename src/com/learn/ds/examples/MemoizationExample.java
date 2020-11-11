package com.learn.ds.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoizationExample {


    public static Map<Integer,Integer> map = new HashMap<>();
    public static List<Integer> list  = new ArrayList<>();
    public static void main(String[] args) {
//        System.out.println(fib(50));

        // to show fetching from memoized map, we need to do factorial twice.
        System.out.println(fact(10));
        System.out.println(fact(9));
    }

    //Memoization in Factorial problem
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }if(map.containsKey(n)){
            System.out.printf("fetching from map [%d]\n",n);
            return map.get(n);

        }else{
            int factorial = n * fact(n-1);
            map.put(n,factorial);
            return factorial;
        }
    }


    //Memoization in Fibonaccis problem
    public static int fib(int number){

        if(number==0){
            return 0;
        }
        if(number == 1){
            return 1;
        } // using Memozation technique
        if(map.containsKey(number)){
            System.out.printf("grabbing memo[%d]\n", number);
            return map.get(number);
        }
        else{
            int num =  fib(number-1) + fib(number - 2);
            map.put(number,num);
            return num;
        }
    }


}
