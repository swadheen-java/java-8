package com.learn.java8.streamTerminal;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {

    private static Map<String, List<Student>> groupingByMethod1(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
    }

    private static Map<String, List<Student>> customizedGroupingByMethod1(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student-> student.getGpa()>3.5?"outstanding":"average"));
    }

    private static Map<String, Map<Integer,List<Student>>> customizedGroupingByMethod2(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student-> student.getGpa()>3.5?"outstanding":"average",
                        groupingBy(Student::getGradeLevel)));
    }


    private static Map<Integer,Integer> groupingByMethod2(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, summingInt(Student::getNotebooks)));
    }


    public static void main(String[] args) {
//        System.out.println(groupingByMethod1());
//
//        System.out.println(customizedGroupingByMethod1());
//
//        System.out.println(customizedGroupingByMethod2());

//        System.out.println(groupingByMethod2());


        System.out.println(twoLevelGrouping());

        System.out.println(threeArgumentGroupingBy());
    }


    //Example groupingBy

    private static Map<Integer,Map<String, List<Student>>>  twoLevelGrouping(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(Student::getGender)));
    }

    private static Map<String,List<Student>> threeArgumentGroupingBy(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toList()));

        // 1st parameter: classifier
        // 2nd parameter: supplier
        // 3rd parameter: collector
    }
















}
