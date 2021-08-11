package com.prac.array;

public class PartitionArrayWithLessAndGreater {
    public static void main(String[] args) {
        int[] arr = {2,8,3,14,6,5,2,1,6,8,3,9,11,3,3,3};
        // all numbers less than val first then the rest numbers output - 2, 2, 1, .....
        // int[] arr = {3,3,3,3,3,3,3};
        int val = 3;
        int[] resArr = partition(arr, val);
        for (int i : resArr) System.out.println(i);
    }
    public static int[] partition(int[] arr, int val){
        int flag = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < val) {
                int temp = arr[i];
                arr[i] = arr[flag];
                arr[flag] = temp;
                flag++;
            }
        }
        return arr;
    }
}
