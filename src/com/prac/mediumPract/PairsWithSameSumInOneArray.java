package com.prac.mediumPract;

import java.util.*;

public class PairsWithSameSumInOneArray {
    public static void main(String[] args) {
        int[] array = {3, 3, 8, 4, 1, 5, 0, 9, 2, 1};
        int sum = 5;
        // o/p -> (4,1),(3,2),(5,0) - count - 3
        int res = findPairsWithSum(array, sum);
        System.out.println("Number of pairs with sum = " +sum + ", is : " + res);
    }
    public static int findPairsWithSum(int[] array, int sum){
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        for(int i : array){
            if(mp.getOrDefault(sum - i,0) > 0) {
                System.out.println(sum - i + " " + i);
                mp.put(sum - i, mp.get(sum - i) - 1);
                count++;
            }
            else mp.put(i, mp.getOrDefault(i, 0) + 1); //3 - 2
            }
        return count;
        }
    }
