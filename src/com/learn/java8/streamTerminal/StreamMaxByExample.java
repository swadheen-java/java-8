package com.learn.java8.streamTerminal;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMaxByExample {

    private static Optional<Student> minByMethod(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    private static Optional<Student> maxByMethod(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println(minByMethod());

        System.out.println(maxByMethod());
    }
}
