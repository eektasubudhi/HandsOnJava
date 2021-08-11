package com.prac.array;

import java.util.HashMap;
import java.util.*;

public class PermutationString {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        PermutationString permString = new PermutationString();

        System.out.println(permString.checkPermString1("poAroo", "Arooop"));
        //"bus", "sub", "ubs", "sbu", "bsu", "usb" -. 2 ways solve
        System.out.println(permString.checkPermString2("Arooop", "oraopo"));

    }
    public static boolean checkPermString1(String string1, String string2){
        /*
            Map<> map1 = new hashmap;
            for(String1){
                   map1.put(each character of string1);
            } -n
            Map<> map2 = new hashmap;
            for(String2){
                   map2.put(each character of string2);
            } -n
            if(map1.size != map2.size) return false;
            for(map1){
                if(map2.contains(map1.get()){
                    map1.get(key

             <3n -> time complexity ->o(n)
            }
        }
        */
        if(string1.length()!= string2.length()) return false;
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        for(int i = 0; i < string1.length(); i++){
            map1.put(String.valueOf(string1.charAt(i)), (map1.getOrDefault(String.valueOf(string1.charAt(i)),0)) + 1);
        }
        for(int j = 0; j < string2.length(); j++){
            map2.put(String.valueOf(string2.charAt(j)), (map2.getOrDefault(String.valueOf(string2.charAt(j)),0)) + 1);
        }
        map1.forEach((k,v)-> System.out.println(k+" "+v));
        map2.forEach((k,v)-> System.out.println(k+" "+v));
        int countOfTrueSequence = 0;
        for(Map.Entry<String, Integer> mp : map1.entrySet()){
            if (map2.containsKey(mp.getKey())) {
                if(map2.get(mp.getKey()) == mp.getValue()) {
                    countOfTrueSequence++;
                }
                else return false;
            }
            else return false;
        }
       if(countOfTrueSequence == map1.size()) return true;


        return false;
    }
    public static boolean checkPermString2(String string1, String string2) {
        /*
        List l= new Arraylist();
        for(each character of string1){
            build the permutations
            l.add(permuted String);
        }
        if(l.contains(string2) return true;
        else return false;
        */
        /*
        int sumAskeyString1 = 0;
        int sumAskeyString2 = 0;

        for(string1){
            sumAskeyString1+=int(string1.charAt(i));
        }
        for(string2){
            sumAskeyString2+=int(string2.charAt(i));
        }
        if(sumAskeyString1 == sumAskeyString2) return true;
        else false;
        */
        int sumAskeyString1 = 0;
        int sumAskeyString2 = 0;

        for(int i = 0; i < string1.length(); i++){
            sumAskeyString1 += (int)string1.charAt(i);
        }
        for(int j = 0; j < string1.length(); j++){
            sumAskeyString2 += (int)string2.charAt(j);
        }
        if(sumAskeyString1 == sumAskeyString2) return true;
        else return false;
    }

}
