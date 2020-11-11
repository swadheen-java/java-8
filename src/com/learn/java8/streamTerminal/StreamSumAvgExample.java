package com.learn.java8.streamTerminal;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.summingInt;

public class StreamSumAvgExample {

    private static int sumMethod(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNotebooks));
    }

    private static double avgMethod(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingDouble(Student::getNotebooks));
    }

    public static void main(String[] args) {
        System.out.println("total number of notebooks: "+sumMethod());

        System.out.println("average number of notebooks :"+avgMethod());
    }
}
