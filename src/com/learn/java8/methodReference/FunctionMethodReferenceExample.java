package com.learn.java8.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> function1MethodRef = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(function1MethodRef.apply("Lionel"));
    }
}
