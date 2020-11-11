package com.learn.generics;

import java.util.ArrayList;

public class GenericWildcardExample {

    private static void method1(ArrayList<?> al){
//        al.add("anyString"); // not valid, give compile time error
        al.add(null);
//        al.add(10); // not valid
    }


    private static void method2(ArrayList<Integer> al){
        al.add(new Integer(10));
        al.add(10);
        al.add(null);
//        al.add("10"); //cannot pass a string in arrayList of Integer type
    }
    public static void main(String[] args) {

        ArrayList<?> al = new ArrayList<String>();

        ArrayList<?> al1 = new ArrayList<Integer>();

        ArrayList<?> al2 = new ArrayList<>();

//        ArrayList<? extends Number>  al3 =  new ArrayList<String>(); // not valid

        ArrayList<? extends Number> al4 = new ArrayList<Integer>();

        ArrayList<? super Number> al5 = new ArrayList<Object>();

//        ArrayList<? super Number> al6 =  new ArrayList<Integer>(); // not valid, it has to be parent of Number class or Number class

    }


    private static < T extends ClassSample1, ClassSample2>void method3(T var){
        var.method1();
    }
}
