package com.learn.string;

import java.util.*;

public class FirstNonRepeatCharFromStringExample {
    public static void main(String[] args) {
        System.out.println("first non repeated char is : "+ get1stNonRepeatChar1("morningm"));
    }

    //Using linkedHashmap- as it maintains order of insertion
    public static char get1stNonRepeatChar(String string){
        if(string == null){
            throw new RuntimeException(" string is null");
        }
        if(string.isEmpty()){
            throw new RuntimeException(" string is null");
        }
        char[] charArray = string.toCharArray();
        LinkedHashMap<Character, Integer> linkedHashMap =  new LinkedHashMap<>();
        for(char ch : charArray){
            if(linkedHashMap.containsKey(ch)){
                linkedHashMap.put(ch,linkedHashMap.get(ch)+1);
            }else{
                linkedHashMap.put(ch,1);
            }
        }

        for(Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        throw new RuntimeException(" non repeating char is not present.");


    }

    //Finding in one pass
    public static char get1stNonRepeatChar1(String string){
        Set<Character> repeatingSet =  new HashSet<>();
        List<Character> nonRepeatingList =  new ArrayList<>();

        for(int i = 0; i< string.length(); i++){
            char ch = string.charAt(i);
            if(repeatingSet.contains(ch)){
                continue;
            }
            if(nonRepeatingList.contains(ch)){
                nonRepeatingList.remove((Character) ch);
                repeatingSet.add(ch);
            }else{
                nonRepeatingList.add(ch);
            }
        }

        return nonRepeatingList.get(0);



    }
}
