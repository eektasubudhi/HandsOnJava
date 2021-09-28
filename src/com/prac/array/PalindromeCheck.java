package com.prac.array;

import java.util.HashMap;
import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
       // String input = "taco act";
        String input = "aaaa   ab bc"; // if string can be palindrome or not
        PalindromeCheck pc = new PalindromeCheck();
        System.out.println(pc.isPalindrome(input));
    }
    public boolean isPalindrome(String input){
        //int =input.length();
        //for(string){ map(save the letter and its count)}
        //for(map){ if(count%2 !=0) oppCount++;}
        // if oppCount++ >1 return false;
        input = input.replaceAll(" ","").toLowerCase();
        Map<String,Integer> letterCount = new HashMap<>();
        int oddCount=0;
        for (int i = 0; i < input.length(); i++){
            letterCount.put(String.valueOf(input.charAt(i)), letterCount.getOrDefault(String.valueOf(input.charAt(i)),0)+1);
        }
        letterCount.forEach((k,v)-> System.out.println(k+" Key "+ v));
        for(Integer in : letterCount.values()){
            if(in % 2 != 0) oddCount++;
        }
        if (oddCount > 1) return false;

        return true;
    }
}
