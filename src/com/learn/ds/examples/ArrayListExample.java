package com.learn.ds.examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList();
        studentList.add(new Student("Swa", "001"));
        studentList.add(new Student("Swb", "002"));
        studentList.add(new Student("swc", "003"));
        studentList.add(new Student("swd", "004"));


        studentList.forEach(student -> System.out.println(student));

        /*studentList.set(1, new Student("SWB-A", "005"));
        System.out.println("After set method call");
        studentList.forEach(student -> System.out.println(student));*/

        /*System.out.println("After add method call");
        studentList.add(3, new Student("SWB-A", "005"));
        studentList.forEach(student -> System.out.println(student));*/

        Student[] arr = studentList.toArray(new Student[studentList.size()]);
    }


}
