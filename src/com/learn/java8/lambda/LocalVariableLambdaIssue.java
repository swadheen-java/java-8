package com.learn.java8.lambda;

import java.util.function.Consumer;

public class LocalVariableLambdaIssue {

    public static void main(String[] args) {
        int i = 3;

        Consumer<Integer> c1 = (i1) -> {

            System.out.println(i+i1);

        };

        c1.accept(5);
    }
}
