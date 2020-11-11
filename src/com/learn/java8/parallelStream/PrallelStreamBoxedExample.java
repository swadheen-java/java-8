package com.learn.java8.parallelStream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class PrallelStreamBoxedExample {

    private static long getSumParallel(List<Integer> list){
        long startTime = System.currentTimeMillis();
        long sum = list.parallelStream()
                .reduce(0, (x,y)-> x+y);
        System.out.println("sum total is: "+sum);
        return System.currentTimeMillis() - startTime;
    }

    private static long getSumSequential(List<Integer> list){
        long startTime = System.currentTimeMillis();
        long sum = list.stream()
                .reduce(0, (x,y)-> x+y);
        System.out.println("sum tota is: "+sum);
        return System.currentTimeMillis() - startTime;
    }


    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1,1000)
                .boxed() // this makes int stream to Integer
                .collect(toList());

        System.out.println(" Parallel :"+ getSumParallel(list));

        System.out.println("Sequential :"+ getSumSequential(list));
    }
}
