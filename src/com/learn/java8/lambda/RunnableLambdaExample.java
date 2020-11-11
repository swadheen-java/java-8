package com.learn.java8.lambda;

public class RunnableLambdaExample  {

    /*
     * prior to java8
     */
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable");
            }
        };

        new Thread(runnable).start();


    /*
     * post java8
     */

    Runnable runnableLambda =  ()-> System.out.println("inside runnable lambda");

    new Thread( runnableLambda).start();

    new Thread(()-> System.out.println("inside runnable lambda2") ).start();

    }
}


