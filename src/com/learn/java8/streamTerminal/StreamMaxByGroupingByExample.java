package com.learn.java8.streamTerminal;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamMaxByGroupingByExample {

    // find max grade by class

    private static Map<Integer,Student> getStudentWithMaxGPAeInEachGrade(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),
                Optional::get)));
    }

    //find the least gpa by grade
    private static Map<Integer,Student> getStudentWithMinGPAInEachGrade(){
       return  StudentDataBase.getAllStudents()
               .stream()
               .collect(groupingBy(Student::getGradeLevel,
                       collectingAndThen(minBy(Comparator.comparing(Student::getGpa))
                       ,Optional::get)));
    }


    public static void main(String[] args) {
        System.out.println(getStudentWithMaxGPAeInEachGrade());

        System.out.println(getStudentWithMinGPAInEachGrade());

    }
}
