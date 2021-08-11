package com.prac.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KeyPadDigitToWordPermutation {
    List<String> results = new ArrayList<>();
    Map<Character, String> digits = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    public static void main(String[] args) {
        String permutation = "23";
        KeyPadDigitToWordPermutation obj = new KeyPadDigitToWordPermutation();
        obj.getAllPermutation(permutation, new StringBuilder(), 0);
        for (String s : obj.results) System.out.println(s);
    }
    public void getAllPermutation(String permutation, StringBuilder sd, int index){
        if(sd.length() == permutation.length()) {
            results.add(sd.toString());
            return;
        }
        String allDigitsChars = digits.get(permutation.charAt(index));
        for(char c : allDigitsChars.toCharArray()){
            sd.append(c);
            getAllPermutation(permutation, sd, index + 1);
            sd.deleteCharAt(sd.length() - 1);
        }
    }
}
