package com.learn.generics;


/*
Generic class with variable of type T
T can be replaced with String/Integer based on our needs.
 */
public class GenericsMainExample<T> {

    private T type;

    public GenericsMainExample(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public static void main(String[] args){
        GenericsMainExample<String> stringGenericsMainExample = new GenericsMainExample<>("swadheen");
        System.out.println(stringGenericsMainExample.getType());

        GenericsMainExample<Integer> integerGenericsMainExample = new GenericsMainExample<>(10);
        System.out.println(integerGenericsMainExample.getType());

        method1(10);
    }

    private static <X extends Integer> void method1(X x){
        System.out.println(x.intValue()*2);

    }
}
