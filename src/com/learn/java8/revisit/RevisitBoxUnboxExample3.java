package com.learn.java8.revisit;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RevisitBoxUnboxExample3 {


    private static List<Integer> getList(){
        return IntStream.range(1,10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getList());

        System.out.println(IntStream.concat(IntStream.range(1,10), IntStream.range(11,20)).boxed().collect(Collectors.toList()));


    }
}
