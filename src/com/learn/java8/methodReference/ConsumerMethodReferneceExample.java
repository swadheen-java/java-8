package com.learn.java8.methodReference;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferneceExample {

    static Consumer<Student> consumer1 = System.out::println;

    static Consumer<Student> consumer2 = Student::getName;

    public static void main(String[] args) {
       // consumer1.accept("lionel");

        StudentDataBase.getAllStudents().forEach(consumer1);


    }
}
