package com.learn.memory;

public class StringInternMethodExample {

    public static void main(String[] args) {

//        String s1 =  new String("new string"); // String objects are created separately in HEAP area
//        String s2 =  new String("new string");
//        System.out.println(s1==s2);
//
//        String s3 = "new string"; // String literals are created in String pool, so only once instance of a string literal is created
//        String s4 = "new string";
//        System.out.println(s3==s4);
//
//        String s5 = new String("new string"); // creates new object
//        System.out.println(s4==s5); // false s4 is pointing to string pool but s5 is pointing to new string object in HEAP.
//
//        String s6 = new String("new string").intern(); // intern()method will put the string into string pool, if it's not already present
//        System.out.println(s6 == s4); // true,


        long start1 = System.currentTimeMillis();
        System.out.println(start1);
        for (int i = 0; i < 10000; i++)
        {
            for (int j = 0; j < 10000; j++) {
                String s7 = "Hello World";
                String s8 = "Welcome";
            }
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1);
        long total_time1 = end1 - start1;
        System.out.println("Time taken to execute"+ " string literal = " + total_time1);


        long start2 = System.currentTimeMillis();
        System.out.println(start2);
        for (int i = 0; i < 10000; i++)
        {
            for (int j = 0; j < 10000; j++) {
                String s9 = new String("Hello World");
                String s10 = new String("Welcome");
            }
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2);
        long total_time2 = end2 - start2;
        System.out.println("Time taken to execute"+ " string literal = " + total_time1);


    }
}

