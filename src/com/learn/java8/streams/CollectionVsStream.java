package com.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionVsStream {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("swad", "song");

        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);
//        stream1.forEach(System.out::println); // Iterating stream more than one is not allowed.

        list.forEach(System.out::println); //Collection can be iterated multiple times
        list.forEach(System.out::println);
    }
}
