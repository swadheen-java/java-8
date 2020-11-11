package com.learn.java8.functionalIntefaces;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.List;
import java.util.Map;

public class BiFunctionExample {


    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFUnctionEx = ((studentList,studentPredicate) -> {
        Map<String, Double> resultMap = new HashMap<>();
        studentList.forEach( student -> {
            if(studentPredicate.test(student)){
                resultMap.put(student.getName(), student.getGpa());
            };
        });
    return resultMap;

    });


    public static void main(String[] args) {

        System.out.println(biFUnctionEx.apply(StudentDataBase.getAllStudents(),PredicateExample.predicate4));

    }
}
