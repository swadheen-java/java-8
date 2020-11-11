package com.learn.java8.streamTerminal;

import com.learn.java8.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;


/*

 */
public class StreamCountingExample {

    private static long count(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() > 3.7)
                .collect(counting());
    }


    public static void main(String[] args) {
        System.out.println("Counting result: "+count());
    }
}
