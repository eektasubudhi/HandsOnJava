package com.prac.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class UniqueCombinationsSumToTarget {
    List<List<Integer>> results = new ArrayList<>();
    public static void main(String[] args) {
        int[] input = {2, 6, 3, 7}; //10, 1, 2, 7, 6, 1, 5  target = 8
        int target = 7;
        //Output = [[2,2,3], [7]]    //Output = [[1,1,6], [1,2,5], [1,7], [2,6]]
        UniqueCombinationsSumToTarget obj = new UniqueCombinationsSumToTarget();
        obj.findAllCombinations(input, target);
        for(List<Integer> l : obj.results) {
            for (Integer i : l){
                System.out.println(i);
            }
            System.out.println("---");
        }
    }
    public List<List<Integer>> findAllCombinations(int[] input, int target){
        allSumCombination(input, target, 0, new ArrayList<Integer>());
        return results;
    }
    public void allSumCombination(int[] input, int target, int index, List<Integer> current){
        if (target == 0) {
            results.add(new ArrayList<Integer>(current));
            return;
        } else if (target < 0) {
            return;
        }
        //sum = sum + input[index];
        //allSumCombination(input, target, index + 1, current);
        for (int i = index; i < input.length; i++) {
            current.add(input[i]);
            allSumCombination(input, target - input[i], i, current);
            current.remove(current.size() - 1);
        }
    }
}
