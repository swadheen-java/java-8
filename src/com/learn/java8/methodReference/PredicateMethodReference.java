package com.learn.java8.methodReference;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.function.Predicate;

public class PredicateMethodReference {

    static Predicate<Student> predicate4 = PredicateMethodReference::refactorPredicate;

    static boolean refactorPredicate(Student s){
        return  Integer.valueOf(s.getGradeLevel())>4;

    }

    public static void main(String[] args) {
        System.out.println(predicate4.test(StudentDataBase.studentSupplier.get()));

        StudentDataBase.getAllStudents().forEach( (student -> {
            if(predicate4.test(student)){
                System.out.println(student.getName());
            }
        }));
    }
}
