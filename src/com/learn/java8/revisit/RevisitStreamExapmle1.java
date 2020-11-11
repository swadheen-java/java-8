package com.learn.java8.revisit;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RevisitStreamExapmle1 {

    // student with highest grade


    static Predicate<Student> studentPredicate = student -> student.getGradeLevel()==2;

    static Optional<Student> getStudentWithHighestGrade(){
        return StudentDataBase.getAllStudents().stream()
                .filter(studentPredicate)
                .reduce((s1,s2)-> (s1.getGpa()>s2.getGpa())?s1:s2);
    }

    // Unique list of activities offered by the school
    static List<String> getListOfActivities(){
       return StudentDataBase.getAllStudents().stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        if(getStudentWithHighestGrade().isPresent()){
            System.out.println(getStudentWithHighestGrade().get());
        }

        System.out.println("Activities offered by school: "+getListOfActivities());

    }
}
