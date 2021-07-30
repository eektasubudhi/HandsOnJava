package com.prac.dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;

public class StringPermutationsWithDups {
    public static void main(String[] args) {
        String permutation = "sommi";
        ArrayList<String> result = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : permutation.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        permutationOfTheString("", map, permutation.length(), result);
        for (String s : result) System.out.println(s);
    }
    public static void permutationOfTheString(String prefix, HashMap<Character, Integer> map,
                                              int strLen, ArrayList<String> result){
        if(strLen == 0) {
            result.add(prefix);
            return;
        }
        for(char c : map.keySet()){
            int count = map.get(c);
            if(count > 0){
                map.put(c,count - 1);
                permutationOfTheString(prefix + c, map, strLen - 1, result);
                map.put(c, count);
            }
        }
    }
}
