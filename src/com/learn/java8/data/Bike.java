package com.learn.java8.data;

public class Bike {
    private String name;
    private String model;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Bike(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Bike(){}

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
