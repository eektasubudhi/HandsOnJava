package com.prac.dynamicProgramming;

public class StartEndSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,5,5,5,7,9};

        int[] res = findIndexRange(arr, 2);
        for (int i : res) System.out.println(i);
    }
    public static int[] findIndexRange(int[] arr, int target){
        int firstOcc = search(arr, target, true);
        if(firstOcc == -1) return new int[]{-1, -1};
        int lastOcc = search(arr, target, false);

        return new int[]{firstOcc, lastOcc};
    }
    public static int search(int[] arr, int target, boolean isFirst){
        int st = 0, en = arr.length - 1;
        while (st <= en){
            int mid = (st+en)/2;
            if(arr[mid] == target) {
                if (isFirst) {
                    if (mid == st || arr[mid - 1] != target) return mid;
                    else en = mid - 1;
                } else {
                    if(mid == en || arr[mid + 1] != target) return mid;
                    else st = mid + 1;
                }
            }
            else if(target < arr[mid]) en = mid - 1;
            else st = mid + 1;
        }
        return -1;
    }
}
