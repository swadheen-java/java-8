package com.learn.java8.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {


    public static Supplier<Student> studentSupplier = () -> {
        Bike bike = new Bike("my bike","model1");
        Student student =   new Student("Adam", 2, 3.6,"male", Arrays.asList("swimming", "football"), 12);
        student.setBike(Optional.ofNullable(bike));
        return student;
    };

    public static List<Student> getAllStudents(){

        Student student1 = new Student("Adam", 2, 3.6,"male", Arrays.asList("swimming", "football"), 13);
        Student student2 = new Student("Emily", 2, 3.5,"female", Arrays.asList("dancing", "singing"), 15);

        Student student3 = new Student("Sophia", 3, 3.1,"female", Arrays.asList("boxing", "guitar", "cleaning"), 20);
        Student student4 = new Student("James", 3, 3.2,"male", Arrays.asList("cooking", "gardening"), 22);

        Student student5 = new Student("Monica", 4, 3.7,"female", Arrays.asList("cleaning", "cooking"), 10);
        Student student6 = new Student("Ross", 4, 3.9,"male", Arrays.asList("rocks", "dianosaur"),11);



        return Arrays.asList(student1, student2, student3, student4, student5, student6);
    }
}
