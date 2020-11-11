package com.learn.java8.optional;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    private static String getStudentName(){
        Student student = StudentDataBase.studentSupplier.get();
//        Student student = null;
        return student.getName();
    }

    private static Optional<String> getStudentNameOptional(){
       Optional<Student> studentOptional =  Optional.ofNullable(StudentDataBase.studentSupplier.get());

//        Optional<Student> studentOptional = Optional.ofNullable(null);

       if(studentOptional.isPresent()){
           return studentOptional.filter(student -> student.getGpa() <4).map(Student::getName);
       }
       return Optional.empty(); // optional with no  value
    }

    public static void main(String[] args) {
        System.out.println(getStudentName());

       Optional<String> stringOptional = getStudentNameOptional();
       if(stringOptional.isPresent()){
           System.out.println(stringOptional.get().length());
       }
       else{
           System.out.println("name not found");
       }
    }
}
