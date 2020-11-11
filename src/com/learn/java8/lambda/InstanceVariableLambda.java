package com.learn.java8.lambda;

import java.util.function.Consumer;

public class InstanceVariableLambda {

    static int value = 4;
    public static void main(String[] args) {
        int anotherValue = 6;
        Consumer<Integer> c1 = (i) -> {
            value++; // can modify static variable / instance variable

         //   anotherValue++; // cannont modify or reassign local variable

            System.out.println(value + i);
        };

       c1.accept(3);
    }
}
