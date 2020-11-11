package com.learn.java8.optional;

import com.learn.java8.data.Bike;
import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

//    filter
    private static void filterMethod(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(optionalStudent.isPresent()){
            String name = optionalStudent.filter(student -> student.getGpa() >3.0).get().getName();
            System.out.println(name);
        }
    }


    //flatmap
    private static void flatMapMehtod(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional <String> bikeName =  studentOptional //Optional<Student <Optional<Bike>>
                .flatMap(Student::getBike) // returns -> Optional<Bike>
                .map(Bike::getName);

        bikeName.ifPresent(s-> System.out.println(s));
    }



    //map
    private static void mapMethod(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(optionalStudent.isPresent()){
            System.out.println(optionalStudent.filter(student -> student.getGpa() >3.0).map(Student::getName).get());
        }
    }

    public static void main(String[] args) {
        filterMethod();

        mapMethod();

        flatMapMehtod();
    }
}
