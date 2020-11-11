package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    /*
    reduce: This is terminal operation. Used to reduce the contents of a stream to a single value.

    It takes two parameters as input:
    1. default of initial value
    2. BinaryOperator<T> - Function that takes two inputs of same type and return one out of the same type
     */

    public static int getMulitiplicationwithReduce(List<Integer> integers){
        return integers.stream()
                .reduce(1,(a,b)->a*b);
    }

    public static Optional<Integer> getMulitiplicationwithReduceWithoutIdentity(List<Integer> integers){
        return integers.stream()
                .reduce((a,b)->a*b);
    }

    //To fetch student with highest GPA
    public static Optional<Student> getStudentWithHighestGPA(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)-> (s1.getGpa()> s2.getGpa()) ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0,1,2,3,4,5);
        System.out.println(getMulitiplicationwithReduce(integers));


       Optional<Integer> optionalProudct = getMulitiplicationwithReduceWithoutIdentity(integers);
       if(optionalProudct.isPresent()){
           System.out.println(optionalProudct.get());
       }


       Optional<Student> optioalStudentWithHighestGPA= getStudentWithHighestGPA();
       if(optioalStudentWithHighestGPA.isPresent()){
           System.out.println(optioalStudentWithHighestGPA.get());
       }

    }
}
