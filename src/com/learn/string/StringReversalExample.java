package com.learn.string;

import java.util.Stack;

public class StringReversalExample {
    public static void main(String[] args) {
        System.out.println("reversed string is: "+ getReversedString("swadheen"));
    }

    public static String getReversedString(String string){



        char[] charArray = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = charArray.length-1; i >=0; i--){
            sb.append(charArray[i]);
        }
       return sb.toString();
    }
}
