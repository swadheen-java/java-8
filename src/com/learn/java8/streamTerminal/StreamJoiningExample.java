package com.learn.java8.streamTerminal;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamJoiningExample {

    private static String joining1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining());
    }


    private static String joining2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(joining("-","[","]"));

    }
    public static void main(String[] args) {
        System.out.println("Joining -1 :"+joining1());
        System.out.println("Joining-2 :"+joining2());
    }
}
