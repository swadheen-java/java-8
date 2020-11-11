package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class StreamMapReduceExample {

    // Find the total number of notebooks the students has


    private static Optional<Integer> getTotalNoteBooks(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNotebooks)
                .reduce((n1,n2) -> n1+n2);
    }

    private static int getTotalNoteBooks2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNotebooks)
                .reduce(0,Integer::sum);
    }

    private static int getMaxNoteBooks(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNotebooks)
                .reduce(0,Integer::max);
    }

    public static void main(String[] args) {
        if(getTotalNoteBooks().isPresent()){
            System.out.println(getTotalNoteBooks().get());
        }

        System.out.println(getTotalNoteBooks2());

        System.out.println(getMaxNoteBooks());

    }
}
