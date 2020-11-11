package com.learn.generics;

public class GenericsBoundedExample<X extends Number> {
    X type;

    public GenericsBoundedExample(X type) {
        this.type = type;
    }

    public X getType() {
        return type;
    }

    public void setType(X type) {
        this.type = type;
    }

    public int add(X a, X b){
        return a.intValue()+b.intValue();
    }

//    public X multiply (X a, X b){
//        return a*b;
//    }

    public static void main(String[] args) {
        GenericsBoundedExample genericsBoundedExample = new GenericsBoundedExample(10);
        System.out.println(genericsBoundedExample.getType());

        System.out.println(genericsBoundedExample.add(1,2));

        Number m = 10;

        Number n = 11;

        System.out.println(m);






    }
}
