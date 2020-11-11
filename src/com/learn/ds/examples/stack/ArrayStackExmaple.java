package com.learn.ds.examples.stack;

import java.util.EmptyStackException;

public class ArrayStackExmaple {
    private Employee[] stack;
    private int top;

    public ArrayStackExmaple(int capacity) {
        stack =  new Employee[capacity];
    }

    public void push(Employee emp){
//        System.out.println("top :"+top);
        stack[top++] = emp; // it top == 0 then stack[0] = emp then top++ will execute
//        top++;
//        System.out.println("top :"+top);
//        System.out.println(emp.toString());
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return stack[top--];
    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[--top]; // difference between top-1 and top-- : top-1 happens immediately, top-- happens after = is executed
    }

    public void printStack() {
        for (int i = top-1 ; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty(){
        return (top==0);
    }

}
