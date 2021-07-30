package com.prac.mediumPract;

import java.util.Arrays;

public class SmallestDifferencePair {
    public static void main(String[] args) {
        int[] arr1 = {34, 1, 11, 2, 80};
        int[] arr2 = {8, 90, 124, 7, 5};
        // o/p - 5-2=3
        System.out.println(findTheSmallestDiffPair(arr1, arr2)+ " : Min Difference");

    }
    public static int findTheSmallestDiffPair(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int minDiff = Math.abs(arr1[0]-arr2[0]);
        int i = 0 ,j = 0;
        while( i < arr1.length && j < arr2.length){
                int diff = Math.abs(arr1[i]-arr2[j]);
                minDiff = Math.min(minDiff, diff);
                if(arr1[i] < arr2[j]) i++;
                else j++;
        }
        return minDiff;
    }

}
