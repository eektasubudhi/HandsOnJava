package com.prac.mediumPract;

import java.util.*;

public class PairsWithSameSumInOneArray {
    public static void main(String[] args) {
        int[] array = {3, 3, 8, 4, 1, 5, 0, 9, 2, 1};
        int sum = 5;
        findPairsWithSum(array, sum);
    }
    public static void findPairsWithSum(int[] array, int sum){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i : array){
            if(mp.getOrDefault(sum - i,0) > 0) {
                System.out.println(sum - i + " " + i);
                mp.put(sum - i, mp.get(sum - i) - 1);
            }
            else{
                mp.put(i, mp.getOrDefault(i, 0) + 1); //3 - 2
            }
            }

        }
    }
