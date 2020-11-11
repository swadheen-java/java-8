package com.learn.memory;

public class PassByValueObjectExample {

    public static void main(String[] args) {
       Customer c = new Customer("Ram");
       method1(c);
        System.out.println(c.getName()); // it prints Sita, because when objects are passed as parameter then actually internally copy of the reference of the object is passed.
    }

    public static void method1(Customer c) {
        c.setName("Sita");
        System.out.println(c.getName());
    }
}
