package com.prac.dynamicProgramming;

import java.util.*;

public class LongestWordChain {
    public static void main(String[] args) {
        String[] words = {"a","b","ba","bca","bda","bdca"};
        LongestWordChain obj = new LongestWordChain();
        int result = obj.findLongestWordChainLength(words);
        System.out.println("Longest word chain is of length : " + result);
    }
    public int findLongestWordChainLength(String[] words) {
        int longestLen = 0;
        Map<String, Integer> memo = new HashMap<>();
        Set<String> presentWords = new HashSet<>();
        Collections.addAll(presentWords, words);
        for(String word : words){
            longestLen = Math.max(longestLen, dfs(memo, presentWords, word));
        }
        return longestLen;
    }
    public int dfs(Map<String, Integer> memo, Set<String> presentWords, String currWord){
        if(memo.containsKey(currWord)) return memo.get(currWord);
        int maxLength = 1;
        StringBuilder sb = new StringBuilder(currWord);

        for(int i = 0; i < currWord.length(); i++){
            sb.deleteCharAt(i);
            if(presentWords.contains(sb.toString())) {
               int currLength = 1 + dfs(memo, presentWords, sb.toString());
                maxLength = Math.max(maxLength, currLength);
            }
            sb.insert(i, currWord.charAt(i));
        }
        memo.put(currWord, maxLength);
        return maxLength;
    }
}
