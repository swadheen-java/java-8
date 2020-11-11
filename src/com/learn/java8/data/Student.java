package com.learn.java8.data;

import java.util.List;
import java.util.Optional;

public class Student {
    String name;
    Integer gradeLevel;
    Double gpa;
    String gender;
    List<String> activities;
    Integer notebooks;
    private Optional<Bike> bike = Optional.empty(); //

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }



    public Integer getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(Integer notebooks) {
        this.notebooks = notebooks;
    }

    public Student(String name, Integer gradeLevel, Double gpa, String gender, List<String> activities, Integer notebooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.notebooks = notebooks;
    }

    public Student(){}

    public Student(String name){
        this.name =  name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                ", notebooks=" + notebooks +
                ", bike=" + bike +
                '}';
    }
}