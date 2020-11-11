package com.learn.java8.revisit;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RevisitStreamExample2 {

    // Get Studdent Name and Student activities in Map

    private static Map<String, List<String>> getStudentActivitiesofGrade2(){
        Map<String, List<String>> map = StudentDataBase.getAllStudents().stream()
                .filter(student-> student.getGradeLevel()==4)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        return map;

    }


    public static void main(String[] args) {
        System.out.println("hello");

        System.out.println(getStudentActivitiesofGrade2());
    }
}
