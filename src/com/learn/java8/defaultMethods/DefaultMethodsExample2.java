package com.learn.java8.defaultMethods;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;


/*
Default method can be overridden but
static method can not be overridden
 */
public class DefaultMethodsExample2 {

    private static Consumer<Student> studentConsumer = studnet -> System.out.println(studnet);
    private static List<Student> sortedListStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }


    //Comparator chaining
    private static Comparator<Student> comparatorGrade =  Comparator.comparing(Student::getGradeLevel);
    private static Comparator<Student> comparatorName = Comparator.comparing(Student::getName);
    private static Comparator<Student> comparatorNull = Comparator.nullsFirst(comparatorGrade); // sorting with null values

    private static List<Student> sortedStudentByGradeAndName(){
        List<Student> studentList = StudentDataBase.getAllStudents();

         studentList.sort(comparatorNull.thenComparing(comparatorName)); // without using stream

         return studentList;
//        return studentList
//                .stream() // using stream
//                .sorted(comparatorNull.thenComparing(comparatorName)) // comparator chaining with thenComparing() method
//                .collect(toList());
    }

    public static void main(String[] args) {

//        sortedListStudent().forEach(studentConsumer);

        sortedStudentByGradeAndName().forEach(studentConsumer);
    }
}
