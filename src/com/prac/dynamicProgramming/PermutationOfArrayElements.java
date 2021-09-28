package com.prac.dynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationOfArrayElements {
    List<Integer> numList = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // o/p-> {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}}
        PermutationOfArrayElements obj = new PermutationOfArrayElements();
        List<List<Integer>> results = obj.getAllPermutations(nums);
        for (List<Integer> l: results){
            for(int i : l) {
                System.out.println(i);
            }
            System.out.println("--------");
        }

    }
    public List<List<Integer>> getAllPermutations(int[] nums){
        List<List<Integer>> output = new ArrayList<>();
        for(int n  : nums) numList.add(n);
        backtrack(nums.length, output, numList, 0);
        return output;
    }
    public void backtrack(int len, List<List<Integer>> output, List<Integer> numList, int index){
        if(index == len) output.add(new ArrayList<>(numList));
        for(int i = index; i < len; i++){
            //Collections.swap(numList, index, i);
            swap(index, i);
            backtrack(len, output, numList, index + 1);
            //Collections.swap(numList, index, i);
            swap(index, i);
        }
    }
    public void swap(int index, int i){
        int temp = numList.get(index);
        numList.set(index, numList.get(i));
        numList.set(i, temp);
    }
}
