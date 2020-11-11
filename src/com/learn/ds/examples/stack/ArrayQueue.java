package com.learn.ds.examples.stack;

import java.util.Arrays;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee emp){
        if(back == queue.length){
            Employee[] newArray = new Employee[2*queue.length];
            System.arraycopy(queue, 0, newArray, 0,queue.length );
            queue = newArray;
        }
        queue[back] =  emp;
        back++;
    }

    public Employee remove(){
        if(back==front){
            System.out.println("Queue is empty");
        }
        Employee emp =  queue[front];
        queue[front]= null;
        front++;

        if(size()==0){
            front = 0;
            back = 0;
        }
        return emp;

    }

    public boolean isEmpty(){
        return (back==front);
    }

    public int size(){
        return back - front;
    }

    public Employee peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");

        }
        return queue[back];
    }

    public void printQueue(){
        for(int i = front; i < back; i++){
            System.out.println(queue[i]);
        }
    }
}
