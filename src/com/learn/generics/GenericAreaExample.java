package com.learn.generics;

import java.util.ArrayList;

public class GenericAreaExample {

    //Generic area
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("swadheen");
//        al.add(10); // CE-as 10 is not a string
        method(al);
        System.out.println(al);
    }


    //Non-generic area - to support backward compatibility
    static void method(ArrayList arrayList){
        arrayList.add(10);
        arrayList.add(10.5);
        arrayList.add(true);
    }
}
