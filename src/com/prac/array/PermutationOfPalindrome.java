package com.prac.array;

import java.util.HashMap;
import java.util.Map;

public class PermutationOfPalindrome {
    public static void main(String[] args) {
       /* Map<Character,Integer> mp = new HashMap<>();
        mp.put('e',2);
        mp.put('k',1);
        mp.put('t',1);
        mp.put('a',3);
        mp.forEach((k,v)-> System.out.println(k+ ":"+v));*/

        String input = "tact coa";

        boolean result = isPermutaionOfThePalindrome(input);
        System.out.println(result+" :result");

    }
    public static boolean isPermutaionOfThePalindrome(String input){
        Map<Character,Integer> mp = new HashMap<>();
        int oddCount=0;
        for(int i =0; i< input.length(); i++){
            if(input.charAt(i)!=' '){
                mp.put(input.charAt(i),mp.getOrDefault(input.charAt(i),0)+1);
            }
        }
        //mp.forEach((k,v)-> System.out.println(k+ " : " +v));
        for (Map.Entry<Character,Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        for (Map.Entry<Character,Integer> entry : mp.entrySet())
            if(entry.getValue()%2 !=0)
                oddCount++;
        System.out.println(oddCount);
        if (oddCount > 1) return false;
        return true;
    }
}
