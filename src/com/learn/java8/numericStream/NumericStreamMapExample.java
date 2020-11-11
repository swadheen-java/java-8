package com.learn.java8.numericStream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    private static List<Integer> mapToObj(){
        return  IntStream.range(1,10)
                .mapToObj(i-> {
                    return new Integer(i);
                }).collect(Collectors.toList());
    }

    private static Long mapToLong(){
        return  IntStream.range(1,10)
                .mapToLong(i->  i)
                .sum();

    }

    private static Double mapToDouble(){
        return  IntStream.range(1,10)
                .mapToDouble(i->  i)
                .sum();

    }



    public static void main(String[] args) {
        System.out.println(mapToObj());

        Function<String, String> function1 = i -> {return i;};

        System.out.println(mapToLong());

        System.out.println(mapToDouble());
    }
}
