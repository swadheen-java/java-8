package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {


    public static List<String> listStudentNames(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }


    public static Set<String> setStudentNames(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toSet());
    }
    public static void main(String[] args) {



        System.out.println(listStudentNames());
        System.out.println(setStudentNames());

    }
}
