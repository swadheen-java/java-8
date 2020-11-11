package com.learn.ds.examples.stack;

public class Main {

    public static void main(String[] args) {

        ArrayStackExmaple stack = new ArrayStackExmaple(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
//        stack.printStack();

       // System.out.println(stack.peek());
        //stack.printStack();

//        System.out.println("Popped: " + stack.pop());
//        System.out.println(stack.peek());

//        int i,j;
//        i=5;
//        j=i++;
//        System.out.println("i:" +i+ "    j:"+j);
//
//        int k,l;
//        k=5;
//        l=++k;
//        System.out.println("k:" +k+ "    l:"+l);


    }
}
