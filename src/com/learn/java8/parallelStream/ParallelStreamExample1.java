package com.learn.java8.parallelStream;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {

    private static long getSorteListActivitiesSequentially(){
        long startTime = System.currentTimeMillis();
         StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
         long endTime = System.currentTimeMillis();
         return endTime - startTime;

    }


    private static long getSortedListActivitiesPrallelly(){

        long startTime = System.currentTimeMillis();

         StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted()
                .distinct()
                .collect(toList());

         long endTime = System.currentTimeMillis();

         return endTime - startTime;


    }


    public static void main(String[] args) {
        System.out.println("Duration of sequential operaiton : "+getSorteListActivitiesSequentially());


        System.out.println("Duration of parallel operation : "+ getSortedListActivitiesPrallelly());
    }
}
