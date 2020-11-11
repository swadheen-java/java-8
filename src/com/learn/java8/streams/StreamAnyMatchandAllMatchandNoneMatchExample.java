package com.learn.java8.streams;

import com.learn.java8.data.StudentDataBase;

public class StreamAnyMatchandAllMatchandNoneMatchExample {


    /*
    AnyMatch() -> returns true if any one of the element matches the predicate, otherwise false
    allMatch() -> returns true if all the elements in the stream matches the predicate, otherwise false
    NoneMatch -> retursn true if none of the element matches( opposite of all match())
     */

    private static boolean anyMatchMethod(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student-> student.getGpa() > 4.0);
    }

    private static boolean allMatchMethod(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>3.0);
    }

    private static boolean noneMatchMethod(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>4.0);
    }

    public static void main(String[] args) {
        System.out.println(anyMatchMethod());

        System.out.println(allMatchMethod());

        System.out.println(noneMatchMethod());
    }
}
