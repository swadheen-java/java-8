package com.learn.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("ram");
        al.add(10); // does not throw any exception

        String string1 = (String) al.get(1); // you need (String) type casting here, generics will help in this situation


        System.out.println(string1.toString());

        al.forEach(System.out::println);

        ArrayList<String> al1 = new ArrayList<String>();


        List<String> al2 =  new ArrayList<String>();

        Collection<String> al3 =  new ArrayList<String>();

//       ArrayList<Object> al4 =  new ArrayList<String>(); // Compile Exception

//        ArrayList<int> al5 = new ArrayList<int>(); // compiletime error : cannot use primitive type in colleciton
    }
}

