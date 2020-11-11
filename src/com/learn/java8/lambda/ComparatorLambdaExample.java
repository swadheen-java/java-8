package com.learn.java8.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /*
        Prior to java8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(" result of comparator  :" + comparator.compare(3,2));


        /*
        After java8
         */

        Comparator<Integer> comparatorLambda = (a, b)->  a.compareTo(b);


        System.out.println(" result of comparator lambda is : "+ comparatorLambda.compare(3,2));

    }

}
