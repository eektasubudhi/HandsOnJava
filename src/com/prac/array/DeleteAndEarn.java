package com.prac.array;

public class DeleteAndEarn {
    public static void main(String[] args) {
        int[] nums = {2,2,3,3,3,4};

        DeleteAndEarn ob = new DeleteAndEarn();
        int res = ob.deleteAndEarn(nums);
        System.out.println(res);
;    }
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int[] countArray = new int[10000 + 1];
        for(int i = 0; i < n; i++){
            countArray[nums[i]]++;
        }
        int prev = countArray[0], current = countArray[1], result = 0;
        for(int i = 2; i < countArray.length; i++){
            result = Math.max(current, prev + i * countArray[i]); // Take the max of current value or previous value + nums[i] * count
            prev = current;
            current = result;
        }
        return result;
    }
}
