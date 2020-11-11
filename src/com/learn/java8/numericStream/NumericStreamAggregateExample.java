package com.learn.java8.numericStream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,100)
                .sum());

        OptionalInt i = IntStream.rangeClosed(1,10).max();
        System.out.println(i.isPresent()?i.getAsInt():0);

        OptionalLong l = LongStream.rangeClosed(1,10).min();
        System.out.println(l.isPresent()?l.getAsLong():0);

        OptionalDouble d = IntStream.rangeClosed(1,100).average();
        System.out.println(d.isPresent()? d.getAsDouble():0);



    }
}
