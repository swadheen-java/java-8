package com.learn.java8.optional;

import java.util.Optional;

public class OptionalofEmptyNullableExample {

    public static Optional<String> ofNullable() {
        Optional<String> stringOptional1 = Optional.ofNullable(null);
        return stringOptional1;
    }

    public static Optional<String> of(){
        Optional<String> stringOptional2 = Optional.of("hi");
        return stringOptional2;
    }

    public static Optional<String> empty(){
        Optional<String> stringOptional3 = Optional.empty();
        return stringOptional3;

    }
    public static void main(String[] args) {
        System.out.println(ofNullable());

        System.out.println(of());

        System.out.println(empty());
    }
}
