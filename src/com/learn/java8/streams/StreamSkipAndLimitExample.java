package com.learn.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamSkipAndLimitExample {


    /*
    skip() and limit() example
     */

    private static Optional<Integer> limitMethod(List<Integer> list){
        return list.stream()
        .limit(3)
        .reduce((a,b)-> a+b);
    }


    private static Optional<Integer> skipMethod(List<Integer> list){
        return list.stream()
                .skip(1)
                .limit(2)
                .reduce(Integer::sum);
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> emptyList = new ArrayList<>();

      if(limitMethod(list).isPresent()){
          System.out.println(limitMethod(list).get());

        }

        if(skipMethod(list).isPresent()){
            System.out.println(skipMethod(list).get());

        }


    }
}
