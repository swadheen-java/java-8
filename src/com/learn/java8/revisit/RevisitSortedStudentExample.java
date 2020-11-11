package com.learn.java8.revisit;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RevisitSortedStudentExample {


    private static List<Student> getSortedStudents(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    private static Optional<Student> getFirstwithSwimming(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getActivities().contains("cleaning"))
                .findFirst();
    }

    private static List<String> getListActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
      getSortedStudents().forEach(System.out::println);

      Optional<Student> student = getFirstwithSwimming();
        if (student.isPresent()) {
            System.out.println(student.get());
        }

        System.out.println(getListActivities());

        List<String> lStudent = StudentDataBase.getAllStudents().stream()
                .map(student1 -> student1.getActivities())
                .flatMap(studentList -> studentList.stream())
                .collect(Collectors.toList());

        System.out.println(lStudent);


    }
}
