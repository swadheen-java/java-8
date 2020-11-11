package com.learn.java8.optional;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //orElse
    public static String optionalOrElse(){
//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElse("default");

        return name;
    }
    //orElseGet

    public static String optionalOrElseGet(){
         Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

//        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElseGet(()->"hello");

        return name;
    }
    //orElsethrow
    public static String optionalOrElseThrow(){
//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("no data"));

        return name;
    }

    public static void main(String[] args) {

        System.out.println("orElse : "+ optionalOrElse());

        System.out.println("orElseGet : "+ optionalOrElseGet());

        System.out.println("orElseThrow : "+ optionalOrElseThrow());



    }
}
