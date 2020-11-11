package com.learn.java8.functionalIntefaces;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.function.Predicate;

public class PredicateExample {

    static  Predicate<Integer> predicate2 = i-> i%2==0;

    static  Predicate<Integer> predicate1 = i-> i%5==0;

    static Predicate<Student> predicate3 = (s)-> s.getGpa()>3.5;

    static Predicate<Student> predicate4 = (s) -> s.getGradeLevel()>4;


    public static void predicateAnd(){
        System.out.println(predicate1.and(predicate2).test(10));

        System.out.println(predicate1.and(predicate2).test(9));
    }

    public static void predicateOr(){
        System.out.println(predicate1.or(predicate2).test(10));

        System.out.println(predicate1.or(predicate2).test(8));
    }

    public static void predicateNegate(){
        System.out.println(predicate1.or(predicate2).negate().test(10));

        System.out.println(predicate1.or(predicate2).negate().test(8));
    }


    public static void filterStudentByGPA(){
        StudentDataBase.getAllStudents().forEach((student) -> {
            if(predicate3.test(student)) {
                System.out.println(student);
            }

        });

    }

    public static void filterStudentByGrade(){
        StudentDataBase.getAllStudents().forEach( (student) -> {
            if(predicate4.test(student)){
                System.out.println(student);
            }
        });

    }

    public static void filterStudentByGradeandGPA(){
        StudentDataBase.getAllStudents().forEach( (student) -> {
            if(predicate3.or(predicate4).negate().test(student)){
                System.out.println(student);
            }
        });

    }
    public static void main(String[] args) {

        System.out.println(predicate2.test(5));
        System.out.println(predicate2.negate().test(5));

        predicateAnd();

        predicateOr();

        predicateNegate();

        filterStudentByGPA();

        filterStudentByGrade();

        filterStudentByGradeandGPA();


    }
}
