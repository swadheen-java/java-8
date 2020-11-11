package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {


    public static List<Student> sortyStudentGPA(){
       return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortyStudentGPADesc(){
        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static List<String> getStudentActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
//                .peek(string ->{
//                    System.out.println(string);
//                })
                .sorted(Comparator.comparing(String::toString).reversed())
//                .peek(string->{
//                    System.out.println(string);
//                })
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        System.out.println("Student sorted by GPA" );
        sortyStudentGPA().forEach(System.out::println);

        System.out.println("Studnet sorted in desc by GPA");
        sortyStudentGPADesc().forEach(System.out::println);

        getStudentActivities().forEach(System.out::println);
    }
}
