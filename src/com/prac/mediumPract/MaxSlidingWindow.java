package com.prac.mediumPract;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        MaxSlidingWindow mx = new MaxSlidingWindow();
        int[] result = mx.maxSlidingWindow(arr, k);//mx.maxSlidingWindowNew(arr, k); //
        for(int i : result) System.out.println(i);
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[(nums.length - k)+1];
        for(int i = 0; i <= nums.length-k; i++){
            int count = 1;
            int max = nums[i];
            int ind = i;
            while(count<=k){
                if(nums[ind]> max) max = nums[ind];
                ind++;
                count++;
            }
            res[i] = max;
        }
        return res;
    }
    public int[] maxSlidingWindowNew(int[] nums, int k) {
        //{1,3,-1,-3,-2,3,6,7};
        int[] result = new int[(nums.length-k)+1];
        int count = 0;
        Deque<Integer> q = new LinkedList<Integer>();
        int i =0;
        int max = nums[i];
        for(; i < k; i++) {
            while((!q.isEmpty()) && nums[i]> nums[q.peek()])
                q.removeLast();
            q.addLast(i);
        }
        for(int j = i; j < nums.length; j++) {

            while((!q.isEmpty()) && q.peek() < j-k){
                q.removeFirst();
            }
            while((!q.isEmpty()) && nums[i] > nums[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        for(int l =0; l< result.length;l++) {
            max = nums[q.peek()];
            result[l] = max;
        }
        return result;
    }
}
