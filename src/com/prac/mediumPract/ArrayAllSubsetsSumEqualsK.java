package com.prac.mediumPract;

import java.util.HashMap;
import java.util.Map;

public class ArrayAllSubsetsSumEqualsK {
    static int count = 0;
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int k = 3; // output - 2
        //input - {0, 1, 2, 3, 4, 5}, 5 output -2
        //int count = countOfSubsetSumEqualK(arr, k);
        //System.out.println("Number of subsets equals to K is: "+count);
        countOfSubsetSumEqualK(arr, k);
        System.out.println("Number of subsets equals to K is: "+count);
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
    public static void countOfSubsetSumEqualK(int[] arr, int k){
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        mp.put(0,1); // {1, 1, 2, 3}
        for(int i = 0; i< arr.length; i++){
            //sum += arr[i];
            if(mp.containsKey(k-arr[i])) {
                count += 1;
                mp.put(k-arr[i], mp.get(k - arr[i])-1);
            }
            else mp.put(arr[i],mp.getOrDefault(arr[i],0)+1); // 1,1  3,1
        }
    }
}
