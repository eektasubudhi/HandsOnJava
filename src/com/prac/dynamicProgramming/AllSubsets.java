package com.prac.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubsets {
    List<List<Integer>> output = new ArrayList<>();
    int n, k;
    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        AllSubsets obj = new AllSubsets();
        List<List<Integer>> result = obj.subsets(nums);
        for(List<Integer> l : result) {
            for (Integer i : l){
                System.out.println(i);
            }
            System.out.println("---");
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        for(k = 0; k < n + 1; k++){
            backtrack(0, new ArrayList<Integer>(), nums);
        }
        return output;
    }

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums){
        if(curr.size() == k){
            output.add(new ArrayList(curr));
            return;
        }
        for(int i = first; i < n; ++i){
            curr.add(nums[i]);
            backtrack(i + 1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }
}
