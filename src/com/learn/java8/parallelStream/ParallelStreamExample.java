package com.learn.java8.parallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    private static int getSumBySequentialMethod(){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        return list1.stream().reduce(0,(a,b)-> a+b);

    }

    private static int getSumByParallelMethod(){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        return list1.parallelStream().reduce(0,(a,b)-> a+b);

    }

    private static int getSumSequentially(){
       return  IntStream.range(1,100000)
                .sum();
    }

    private static int getSumParllelly(){
        return  IntStream.range(1,100000)
                .parallel()
                .sum();
    }

    private static long checkPerformance(Supplier<Integer> supplier, int times){

        long startTime = System.currentTimeMillis();
        for(int i=0; i< times; i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) {

//        System.out.println("sequential :"+getSumBySequentialMethod());
//
//        System.out.println("parallel :"+getSumByParallelMethod());

        System.out.println("starting time: ");
        System.out.println(" Sum sequentially :"+checkPerformance(ParallelStreamExample::getSumSequentially,20));

        System.out.println("sum parallelly :"+checkPerformance(ParallelStreamExample::getSumParllelly,20));
    }
}
