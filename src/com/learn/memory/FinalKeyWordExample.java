package com.learn.memory;

public class FinalKeyWordExample {
    public static void main(String[] args) {
        final Customer c = new Customer("Sita");
//        c = new Customer("Ram"); // C being final, we cannot change it to point it to new object but we can change the object inside the object

        c.setName("Ram");

        System.out.println(c.getName());
    }
}
