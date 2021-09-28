package com.prac.stackQueue;

import java.util.PriorityQueue;
/*Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 */
public class KthLargestElementInArray {
    public static void main(String[] args) {
        int[] input = {3,2,3,1,2,4,5,5,6};//{3,2,1,5,6,4};
        int k = 4;// 2;

        int result = getKthLargestElement(input, k);
        System.out.println(result + " : is the kth largest element in the list.");
    }
    public static int getKthLargestElement(int[] arr, int kth){
        if(arr.length == 0) return 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for(int i : arr){
            que.add(i);
            if(que.size() > kth){
                que.poll();
            }
        }
        return que.poll();
    }
}
