package com.prac.mediumPract;

public class SubSort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,9,11,7,12,6,7,8,16,17,18};
        // indexes range of sub array that needs to be sorted to sort the whole array.
        subArrayToBeSorted(arr);
    }
    public static void subArrayToBeSorted(int[] arr){
        int leftMin = -1;
        int leftMax = 0;
        int rightMax = Integer.MAX_VALUE;
        int rightMin = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < leftMin) leftMax = i;
            else leftMin = arr[i];
        }
        for(int j = arr.length - 1; j >= 0; j--){
            if(arr[j] > rightMax) rightMin = j;
            else rightMax = arr[j];
        }

        System.out.println(rightMin + " " + leftMax);
    }
}
