package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    /*
    Flatmap: converts(transforms) one type to another as like map() method

    Used in the context of Stream where each element in the stream represents multiple elements.

    Exmaple:
    Each stream element represents multipe elements.
    like: Stream<List>
            Stream<Arrays>
     */

    public static List<String> getListOfStudentActivities(){
        return StudentDataBase.getAllStudents().stream()// Stream<Students>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .distinct()
               .sorted((a,b)->b.compareTo(a)) //sorting in descending order
                .collect(Collectors.toList());
    }

    public static Set<String> getSetOfStudentActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
    }

    public static long getSetOfStudentActivitiesCount(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        System.out.println(getListOfStudentActivities());

        System.out.println(getSetOfStudentActivities());

        System.out.println(getSetOfStudentActivitiesCount());
    }
}
