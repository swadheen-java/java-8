package com.learn.java8.streams;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {


    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("lione","messi", "luis", "suarez");
        nameStream.forEach(name-> System.out.println(name));

        Stream.iterate(1,x->x+1)
                .skip(10)
                .limit(10)
                .forEach(i -> System.out.println(i));

        Stream.generate(()->new Random().nextInt(100))
                .limit(5)
                .forEach(i-> System.out.println(i));

        Supplier<Integer> supplierRandomInteger = new Random()::nextInt;
        
        Stream.generate(new Random()::nextInt)
                .limit(5)
                .forEach(i-> System.out.println(i));
    }
}
