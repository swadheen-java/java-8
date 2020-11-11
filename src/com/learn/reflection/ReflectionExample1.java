package com.learn.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionExample1 {

    public static void main(String[] args) throws Exception {
        ClassA classA = new ClassA();
        Class c = classA.getClass();
        System.out.println("name of the class is: "+ c.getName());

        Constructor constructor = c.getConstructor();
        System.out.println("Name of constructor is: "+ constructor.getName());

//        Method[] methods = c.getMethods();
//        for(Method method: methods){
//            System.out.println(method.getName());
//        }

        Method[] declaredMethods = c.getDeclaredMethods();
        for(Method method: declaredMethods){
//            method.invoke(null);
            System.out.println(method.getName());
        }


    }
}
