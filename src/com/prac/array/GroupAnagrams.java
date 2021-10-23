package com.prac.array;
import java.io.*;
import java.util.*;
/*
 Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Input: strs = [""]
Output: [[""]]


negative - base case missed
missed - scenarios - asking questions
coding - latest

 */
public class GroupAnagrams {
        static List<List<String>> result = new ArrayList<>();

        public static void main(String[] args) {
            System.out.println("====");
            String[] arr = {"eat","tea","tan","ate","nat","bat","BAT"};
            getAllAnagramGroup(arr);
            for(List<String> lst : result){
                System.out.println(lst);
            }
        }
        public static List<List<String>> getAllAnagramGroup(String[] arr){

            if(arr.length == 0) return result;

            Map<Integer, List<String>> mp = new HashMap<>();
            for(String st: arr){
                int askVal = 0;
                for(char c : st.toCharArray()){
                    askVal += Integer.valueOf(c);
                }
                List<String> newL = mp.getOrDefault(askVal, new ArrayList<>());
                newL.add(st);
                mp.put(askVal, newL);
            }
            for(Map.Entry<Integer, List<String>> e: mp.entrySet()){
                result.add(e.getValue());
            }
            return result;
        }

    }

