package com.prac.mediumPract;

public class MinLenSubArraySumToTarget {
    public static void main(String[] args) {
        int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
        int target = 213;

        int result = minLenSubArray(nums, target);
        System.out.println(result);
    }
    public static int minLenSubArray(int[] nums, int target){
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= target){
                minLen = Math.min(minLen, i - temp + 1);
                sum -= nums[temp++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
