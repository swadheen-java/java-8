package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        Predicate<Student> predicateStudentGrade = student -> student.getGradeLevel()== 3;

        Predicate<Student> predicateStudentGPA = student -> student.getGpa()>3.0;

        Map<String,List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
//                .peek(student -> {
//                    System.out.println("Before 1st filter"+student);
//                })
                .filter(predicateStudentGrade)
                .peek(student -> {
                    System.out.println("after 1st filter: "+student);
                })
                .filter(predicateStudentGPA)
//                .peek(student -> {
//                    System.out.println("last filter"+student);
//                })
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }


}
