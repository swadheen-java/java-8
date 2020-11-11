package com.learn.generics;

import java.util.ArrayList;
import java.util.Arrays;

 class GenericExample3 {


    private static <T extends Number> int method1(ArrayList<T> num){
        return num.get(0).intValue();
    }

    private static void method2(ArrayList<? extends Number> al){
        System.out.println(al.get(0));
    }

    private static void method3(ArrayList<? super Integer> al){
        System.out.println(al.get(0));
    }


    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        System.out.println(method1(integerArrayList));



        ArrayList<? extends Number> al =  new ArrayList< Integer>(); // is valid

        //ArrayList<? extends Number> al1 =  new ArrayList< ?>(); // invalid


        ArrayList<Integer> al2 =  new ArrayList< Integer>(); // valid
        al2.add(11);

        System.out.println(method1(al2));

        method2(al2);

        method3(al2);
    }
}
