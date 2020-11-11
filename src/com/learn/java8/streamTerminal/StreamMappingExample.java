package com.learn.java8.streamTerminal;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamMappingExample {

    private static List<String> mapping(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName,toList())); // using mapping() method
    }

    private static List<String> mapping1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) // old way - adding intermediate steps of mapping
                .collect(Collectors.toList());
    }




    public static void main(String[] args) {
        mapping().forEach(x-> System.out.println(x));
    }
}
