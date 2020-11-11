package com.learn.ds.examples.stack;

public class ArrayQueueMain {
    public static void main(String[] args) {
    ArrayQueue arrayQueue = new ArrayQueue(5);

        arrayQueue.add(new Employee("Jane", "Jones", 123));
        arrayQueue.add(new Employee("John", "Doe", 4567));
        System.out.println(arrayQueue.remove());
        arrayQueue.add(new Employee("Mary", "Smith", 22));
        System.out.println(arrayQueue.remove());
        arrayQueue.add(new Employee("Mike", "Wilson", 3245));
        System.out.println(arrayQueue.remove());
        arrayQueue.add(new Employee("Bill", "End", 78));
        System.out.println(arrayQueue.remove());
        arrayQueue.add(new Employee("John1", "Doe1", 4567));
        System.out.println(arrayQueue.remove());
        arrayQueue.add(new Employee("John2", "Doe2", 4568));
        System.out.println(arrayQueue.remove());
        arrayQueue.add(new Employee("John3", "Doe3", 4569));
        System.out.println(arrayQueue.remove());


//        arrayQueue.printQueue();
//
//        System.out.println(arrayQueue.remove());
//        System.out.println(arrayQueue.remove());
//        System.out.println(arrayQueue.remove());
//        System.out.println(arrayQueue.remove());

        arrayQueue.printQueue();
    }
}
