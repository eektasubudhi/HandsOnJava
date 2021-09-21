package com.prac.mediumPract;

import java.util.HashMap;
import java.util.Map;

public class ArrayAllSubsetsSumEqualsK {
    static int countPair = 0;
    static int countSubset = 0;

    public static void main(String[] args) {
        int arr[] = {1, -1, 0};
        int k = 0; // output - 2
        //input - {0, 1, 2, 3, 4, 5}, 5 output -2
        //int count = countOfSubsetSumEqualK(arr, k);
        //System.out.println("Number of subsets equals to K is: "+count);
        countOfPairSumEqualK(arr, k);
        System.out.println("Number of Pairs equals to K is: " + countPair);

        countOfSubsetSumEqualK(arr, k);
        System.out.println("Number of subsets equals to K is: " + countSubset);
    }
    /*public static void countOfSubsetSumEqualK(int[] arr, int k){
        //int count = 0;
        for(int i = 0; i< arr.length; i++){
            int sum = 0;
            for(int index = i; index<arr.length; index++){
                sum+=arr[index];
                if (sum == k) count++;
            }
        }
        //return count;
    }*/
    public static void countOfPairSumEqualK(int[] arr, int k){
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        //put(0,1); // {1, 1, 2, 3}
        for(int i = 0; i < arr.length; i++){
            //sum += arr[i];
            if(mp.containsKey(k - arr[i])) {
                countPair += 1;
                mp.put(k - arr[i], mp.get(k - arr[i]) - 1);
            }
            else mp.put(arr[i], mp.getOrDefault(arr[i],0) + 1); // 1,1  3,1
        }
    }
    public static void countOfSubsetSumEqualK(int[] arr, int k){
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        mp.put(0,1); // {1, 1, 2, 3}
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(mp.containsKey(sum - k)) {
                countSubset += mp.get(sum - k);
                //mp.put(sum - k, mp.get(sum - k) - 1);// if element can not be reused
            }
            mp.put(sum, mp.getOrDefault(sum,0) + 1); // 1,1  3,1
        }
    }
}
