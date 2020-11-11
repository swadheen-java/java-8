package com.learn.java8.functionalIntefaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args){

        BiConsumer<String,String> biConsumer = (a,b) -> {
            System.out.println(a + " "+b);
        };

        biConsumer.accept("java", "8");

        BiConsumer<Integer, Integer> multiply = (intA, intB) -> {
            Integer intC = intA * intB;
            System.out.println("multiplication result :"+intC);
        };

        multiply.accept(4,5);


        BiConsumer<Integer, Integer> division = (intA, intB) ->{
            System.out.println( "Division result: "+ intA/intB);
        };

        multiply.andThen(division).accept(10,5);
    }
}
