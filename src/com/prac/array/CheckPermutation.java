package com.prac.array;

public class CheckPermutation {
    public static void main(String[] args) {
        String input1 = "ac"; //"happy";
        String input2 = "bb"; //"ppyha";

        boolean result = IsPermutation(input1, input2);
        System.out.println(result + " : If the 1st string is permutation of 2nd string");

        boolean result1 = inPermutationOptimized(input1, input2);
        System.out.println(result1 + " : If the 1st string is permutation of 2nd string Optimized");

    }
    public static boolean IsPermutation(String input1, String input2){
        int input1AskSum = 0;
        int input2AskSum = 0;

        for(int i = 0; i < input1.length(); i++){
            input1AskSum += (int)Character.toLowerCase(input1.charAt(i));
        }
        for(int j = 0; j < input2.length(); j++){
            input2AskSum += (int)Character.toLowerCase(input2.charAt(j));
        }
        if(input1AskSum != input2AskSum) return false;
        return true;
    }
    public static boolean inPermutationOptimized(String input1, String input2){
        if(input1.length() != input2.length()) return false;
        int[] count = new int[26];
        for(int i = 0; i < input1.length(); i++){
            count[Character.toLowerCase(input1.charAt(i)) - 'a']++;
        }
        for (int i = 0; i < input2.length(); i++){
            count[Character.toLowerCase(input2.charAt(i)) - 'a']--;
            if(count[Character.toLowerCase(input2.charAt(i)) - 'a'] < 0) return false;
        }
        return true;
    }
}
