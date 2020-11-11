package com.learn.generics;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;

public class GenericsExample2 {

    // Method signature is comprise of method name and the parameters
    // in below case method signatures are same at compile time
//    private int method1(ArrayList<String> al){
//        return 1;
//    }

    private String method1(ArrayList<Integer> al){
        return "1";
    }


    public static void main(String[] args) {
        ArrayList al = new ArrayList<String>();
        /*
        All the below statements are valid
         */
        al.add("String");
        al.add(10);
        al.add(true);





    }


}
