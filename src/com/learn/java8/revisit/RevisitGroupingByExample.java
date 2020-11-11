package com.learn.java8.revisit;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class RevisitGroupingByExample {

    /*
    groupingby() method terminal operation
     */

    private static Map<String, List<Student>> groupingByMethod1(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
    }

    private static Map<String, List<Student>> groupingMethod2(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa()>3.5?"good":"average"));
    }

    private static Map<String,Map<Integer,List<Student>>> groupingMethod3(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student-> student.getGpa()>3.5?"good":"average",
                        groupingBy(Student::getGradeLevel)));
    }



    public static void main(String[] args) {
        System.out.println(groupingByMethod1());

        System.out.println(groupingMethod2());

        System.out.println(groupingMethod3());
    }
}
