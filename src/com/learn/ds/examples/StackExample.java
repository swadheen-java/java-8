package com.learn.ds.examples;

import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("ram");
        stack.push("sita");
        stack.pop();
        System.out.println(stack.peek());
    }

}
