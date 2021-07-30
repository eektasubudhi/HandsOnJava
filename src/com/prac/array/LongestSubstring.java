package com.prac.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abba";//"pwwkew"; //"aweawk";
        int output = findLongestSubstring(input);
        System.out.println(output+ " : Longest length unique Substring");
    }
    public static int findLongestSubstring(String input){
        Map<Character, Integer> mp = new HashMap<>();
        int index = 0;
        int ans = 0;
        for(int i = 0, j = 0; i < input.length(); i++){
            if(mp.containsKey(input.charAt(i))){
                j = Math.max(mp.get(input.charAt(i))+1, j);
                //j = Math.max(mp.get(input.charAt(i)), j);
            }
            ans = Math.max(ans, i-j+1); // 1 2
            mp.put(input.charAt(i),index++);
        }
        return ans;
    }
}
