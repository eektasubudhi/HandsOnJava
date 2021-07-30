package com.prac.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringUnique {
    public static void main(String[] args) {
        String input = "Eekta";
        boolean result = isUnique(input); // input string has all unique character
        boolean result2 = isUniqueWithDataStructure(input);
        System.out.println(result+" : Result without datastructure");
        System.out.println(result2+" : Result with datastructure");
    }
    public static boolean isUnique(String input){
        for(int i=0; i<input.length();i++){
            for(int j=i+1; j<input.length();j++){
                if(Character.toLowerCase(input.charAt(i))==Character.toLowerCase(input.charAt(j))) return false;
            }
        }
        return true;
    }
    public static boolean isUniqueWithDataStructure(String input){
        Set<Character> st = new HashSet<>();
        for(int i =0; i<input.length(); i++){
            if(st.contains(Character.toLowerCase(input.charAt(i)))) return false;
            else st.add(Character.toLowerCase(input.charAt(i)));
        }
        return true;
    }

}
