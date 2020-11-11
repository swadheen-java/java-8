package com.learn.java8.streamTerminal;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamPartioningByExample {

    /*
    partitioningBy accepts predicate

    parititioningBy is like groupingBy

     */

    static Predicate<Student> predicate1 = student -> student.getGpa()>3.5;

    private static Map<Boolean,List<Student>> partioningByMethod(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(student-> student.getGpa()>3.5));
    }

    private static  Map<Boolean,List<Student>> paritioningByMethod1(){
        return StudentDataBase.getAllStudents()
                .stream()
               .collect(Collectors.partitioningBy(predicate1
               ,toList()));
    }

    public static void main(String[] args) {
        System.out.println(partioningByMethod());

        System.out.println(paritioningByMethod1());


        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = list1.stream()
                .flatMap(i -> (Stream.of(i*i, i*i*i)))
                .collect(toList());

        System.out.println(list2);
    }
}
