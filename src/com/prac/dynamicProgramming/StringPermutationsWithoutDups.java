package com.prac.dynamicProgramming;


import java.util.ArrayList;

public class StringPermutationsWithoutDups {
    public static void main(String[] args) {
        String permutation = "somi";
        ArrayList<String> result = new ArrayList<>();
        permutationOfTheString("", permutation, result);
        for (String s : result) System.out.println(s);
    }
    public static void permutationOfTheString(String prefix, String permutation, ArrayList<String> result){
        if (permutation.length() == 0){
            result.add(prefix);
        }
        for(int i = 0; i < permutation.length(); i++){
            String before = permutation.substring(0,i);
            String after = permutation.substring(i+1, permutation.length());
            char c = permutation.charAt(i);
            permutationOfTheString(prefix+c, before+after, result);
        }
    }
}
