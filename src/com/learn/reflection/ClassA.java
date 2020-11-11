package com.learn.reflection;

public class ClassA {
    int i;

    public ClassA(int i) {
        this.i = i;
    }

    public ClassA(){}

    private void method1(){
        System.out.println("from private method");
    }

    public void method2(){
        System.out.println("from public method with no argument.");
    }

    public void method3(int i){
        System.out.println("from public method with paramter: "+i);

    }
}
