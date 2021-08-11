package com.prac.array;

public class SortedArrayRotated {
    public static void main(String[] args) {
        //{2,3,4,5,6,7,0,1} -> sorted array rotated 2 times. find the highest element
        //int[] arr = {7,8,15,70,1,4,5,6}; // 0,1,2,3,4,5,6,7 //{2,3,4,5,6,7,0,1}
        int[] arr = {7,8,15,70,1,4,5,6};//{7, 8, 15, 60, 70, 1, 5, 6};
        int highest = findHighest(arr);
        int low = 0;
        int high = arr.length - 1;
        int highest2 = findHighestBinarySrch(arr, low, high);
        System.out.println(highest);
        System.out.println(highest2);
    }
    public static int findHighest(int[] arr){
        int timesRotated = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]) {
                timesRotated = (arr.length - 1) - i;
                break;
            }
        }

        return arr[(arr.length - 1) - timesRotated];
    }
    public static int findHighestBinarySrch(int[] arr,int low,int high){
        if (low == high) return arr[low]; // {7,8,15,70,1,4,5,6};
        int mid = (low + high) / 2;
        if(mid == 0 && arr[mid] > arr[mid + 1]) return arr[mid];
        if(arr[low] > arr[mid]) return findHighestBinarySrch(arr, low, mid - 1);
        else return findHighestBinarySrch(arr, mid + 1, high);
    }

}