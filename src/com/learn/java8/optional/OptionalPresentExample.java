package com.learn.java8.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.ofNullable("hello");
        if(stringOptional.isPresent()){ // return boolean
            System.out.println(stringOptional.get());
        }

        stringOptional.ifPresent(s -> System.out.println(s.length()));
    }
}
