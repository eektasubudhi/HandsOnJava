package com.prac.array;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1};
        int res = findMinLenghtOfSubArrayWithSameDegree(arr);
        System.out.println("Smallest possible length of a (contiguous) subarray of arr, that has the same degree as arr is: " + res);
    }
    public static int findMinLenghtOfSubArrayWithSameDegree(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int degree = 1;

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            degree = Math.max(degree, map.get(arr[i]));
        }
        if(degree == 1) return 1;
        int rangeLength = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> en: map.entrySet()){
            if(en.getValue() == degree){
                int left = 0, right = arr.length - 1;
                while (left < arr.length && arr[left] != en.getKey()) left++;
                while (right >= 0 && arr[right] != en.getKey()) right--;
                rangeLength = Math.min(rangeLength, (right - left) + 1);
            }
        }
        return rangeLength;
    }
}
