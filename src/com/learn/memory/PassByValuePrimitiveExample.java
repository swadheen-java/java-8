package com.learn.memory;

public class PassByValuePrimitiveExample {

    public static void main(String[] args) {
        int j = 11;
        method1(j);
        System.out.println(j);  // prints 11, as the parameter is passed by value not by reference
    }

    public static void method1(int i){
        i = i*10;
        System.out.println(i);
    }
}
