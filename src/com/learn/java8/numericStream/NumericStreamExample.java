package com.learn.java8.numericStream;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.stream.IntStream;

public class NumericStreamExample {


    private static int getIntStream(int a, int b){
        return IntStream.range(a,b) // (1,50) -> includes 1 to 49
                .sum();
    }


    private static int getIntStreamClosedRane(int a, int b){
        return IntStream.rangeClosed(a,b) // (1,50) -> includes 1 to 49
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(getIntStream(1,101));

        System.out.println(getIntStreamClosedRane(1,100));

        System.out.println(IntStream.range(1,50).count());

        int x = IntStream.generate(new Random()::nextInt)
        .limit(10)
        .sum();

        System.out.println(x);
    }
}
