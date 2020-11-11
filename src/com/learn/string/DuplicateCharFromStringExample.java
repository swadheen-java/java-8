package com.learn.string;

import java.util.*;

public class DuplicateCharFromStringExample {

    public static void main(String[] args) {
        getDupilicates("Swadheen");
        getDupilicates(null);
    }

    public static void getDupilicates( String string){
        if(string==null){
            System.out.println("String is null");
            return;
        }

        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }

        Map<Character, Integer> map = new HashMap<>();
        char[] stringChar = string.toCharArray();
        for(Character ch: stringChar){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet ){
            if(entry.getValue()>1){
                System.out.printf("%s : %d %n",entry.getKey(), entry.getValue());

            }
        }
    }
}
