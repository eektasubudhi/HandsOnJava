package com.prac.dynamicProgramming;

import com.prac.array.SquareRoot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindReplacePattern {
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";

        List<String> res = findPatternString(words, pattern);
        System.out.println(res);
    }
    public static List<String> findPatternString(String[] words, String pattern){
        List<String> result = new ArrayList<>();
        for (String word : words)
            if(matches(word, pattern)) result.add(word);
        return result;
    }
    public static boolean matches(String word, String pattern){
        Map<Character, Character> mp1 = new HashMap<>();
        Map<Character, Character> mp2 = new HashMap<>();

        for(int i = 0; i < word.length(); i++){
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if(!mp1.containsKey(w)) mp1.put(w, p);
            if(!mp2.containsKey(p)) mp2.put(p, w);
            if(mp1.get(w) != p || mp2.get(p) != w) return false;
        }
        return true;
    }
}
