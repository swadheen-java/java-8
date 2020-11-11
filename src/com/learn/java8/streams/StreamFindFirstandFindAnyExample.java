package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class StreamFindFirstandFindAnyExample {

    /*
    used to find an element in the stream
    both the functions return the result of type Optional
     */
    
    private static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>3.5)
                .findFirst();
    }

    private static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getActivities().contains("cleaning"))
                .findFirst();
    }

    public static void main(String[] args) {
       if(findFirstStudent().isPresent()){
           System.out.println(findFirstStudent());
       }

       if(findAnyStudent().isPresent()){
           System.out.println(findAnyStudent());
       }
    }
}
