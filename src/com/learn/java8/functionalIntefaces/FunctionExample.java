package com.learn.java8.functionalIntefaces;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.List;
import java.util.Map;

public class FunctionExample {

    static Function<String, String> toUpperFunction = s1 -> s1.toUpperCase();

    static Function<String, String> toUpperAndConcat = s1 -> s1.toLowerCase().concat(" is the brand new string after concat");

    static BiFunction<String, String, Integer> concatAndCount = (s1,s2) -> s1.concat(s2).length();

    static Function<List<Student>,Map<String,Integer>> studentGradeMapFunction = (students -> {
        Map<String,Integer> studentGradeMap =  new HashMap<>();

        students.forEach( student -> {
            if(PredicateExample.predicate4.test(student)){
                studentGradeMap.put(student.getName(), student.getGradeLevel());
            }
        });


        return studentGradeMap;
    });


    public static void main(String[] args) {

        System.out.println(toUpperFunction.apply("Messi"));

        System.out.println(toUpperAndConcat.apply("lionel"));

        System.out.println(concatAndCount.apply( "lionel", "messi"));

        System.out.println(toUpperFunction.andThen(toUpperAndConcat).apply("Lionel"));

        System.out.println(studentGradeMapFunction.apply(StudentDataBase.getAllStudents()));
    }
}
