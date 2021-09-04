package com.prac.mediumPract;

import java.util.HashSet;

public class SumSwap {
    public static void main(String[] args) {
        int arr1[] = {4, 1, 2, 1, 1, 2}; // 18
        int[] arr2 = {3, 6, 3, 3}; // 17
        // swap numbers from both arrays such that the sum of both arrays should be equal.
        swapToEqualSum(arr1, arr2);
    }
    public static void swapToEqualSum(int[] arr1, int[] arr2){
        int sum1 = 0;
        int sum2 = 0;
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int i : arr1) {
            hs1.add(i);
            sum1 += i;
        }
        for(int i : arr2) {
            hs2.add(i);
            sum2 += i;
        }
        int target = (sum1 - sum2) / 2;

        for (Integer a : hs1){
            int find = Math.abs(target - a);
            if(hs2.contains(find)) {
                System.out.println("a: " + a + " b: " + find);
            }
        }
    }
}
