package com.learn.java8.defaultMethods;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class DefaultMethodsExample {


    // sort names in alphabetical order
    public static void main(String[] args) {

        List<String> list = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());

        Collections.sort(list); // before java8 to sort the list
        System.out.println("sorted using Collections.sort() : "+list);

        Collections.reverse(list);
        System.out.println("sorted using Collections.reverse() method : "+ list);





        List<String> lis1t = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());

        lis1t.sort(Comparator.naturalOrder());
        System.out.println("sorted using List.sort() method : "+lis1t);

        lis1t.sort(Comparator.reverseOrder());
        System.out.println("sorted using List.sort() method : "+ lis1t);



    }
}
