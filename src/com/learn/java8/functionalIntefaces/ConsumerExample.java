package com.learn.java8.functionalIntefaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {

    public static void main(String[] args) {
        /* accept and input and performs some action
         * does not return anything
         */
        String string = "someString";
        Consumer<String> consumer1 = (x)-> System.out.print(x.toUpperCase());
        Consumer<String> consumer2 = (x)-> System.out.println(x);
        Consumer<String> consumer3 = (x)-> {
            if(x.equalsIgnoreCase("b")){
                System.out.println("good");
            }else{
                System.out.println("bad");
            }
        };
//        consumer1.accept("abc");

        List<String> list = Arrays.asList("a","b","c","d","e");
        list.forEach(consumer1.andThen(consumer2)); // consumer chaining

//        list.forEach(consumer3);

//       list.forEach((listElement) ->{
//           if("b".equalsIgnoreCase(listElement)){
//               consumer1.andThen(consumer2).accept(listElement);
//           }
//       } );


    }
}

