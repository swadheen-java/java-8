package com.learn.java8.numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStringBoxUnboxExample {


    private static List<Integer> boxing(){ //primitive type to wrapper
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }

    private static int unBoxing(List<Integer> list){ // wrapper to primitive
        return list.stream() // stream of wrapper Integer
                .mapToInt(Integer::intValue)  // int value of the wrapper class
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("boxing : "+ boxing());

        List<Integer> listInteger = Arrays.asList(1,2,3,4,5,6);

        System.out.println("unboxing : "+ unBoxing(listInteger));

    }
}
