package com.prac.mediumPract;

public class ContiguousSequence {
    public static void main(String[] args) {
        int[] arr = {2, 5, -9, 4, 4, -2, 5}; // op-
        ContiguousSequence obj = new ContiguousSequence();
        int maxSum = obj.findTheContiguousMaxSequence(arr);
        System.out.println("Max sum of contiguous sequence of array is : " + maxSum);
    }
    public int findTheContiguousMaxSequence(int[] arr){
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum > maxSum) maxSum = sum;
            else if(sum < 0) sum = 0;
        }
        return maxSum;
    }
}
