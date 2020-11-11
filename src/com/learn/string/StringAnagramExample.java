package com.learn.string;

import java.util.Arrays;

public class StringAnagramExample {
    public static void main(String[] args) {
        System.out.println(checkAnagram1("xwadeehn".toUpperCase(),"swadheen".toUpperCase()));
    }

    public static boolean checkAnagram(String string1, String string2){
        String string3 = string1.toUpperCase();
        String string4 = string2.toUpperCase();
        char[] char1 = string3.toCharArray();
        char[] char2 = string4.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if (Arrays.equals(char1,char2)){
            return true;
        }else
            return false;

    }

    public static boolean checkAnagram1(String string1, String string2) {
        if(string1.length() != string2.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(string2);
        char[] string1Arr =  string1.toCharArray();
        for(char ch: string1Arr){
          if( sb.indexOf(""+ch) != -1){
            sb.deleteCharAt(sb.indexOf(""+ch));
          }else{
              return false;
          }
        }
        return true;
    }
}

