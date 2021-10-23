package com.prac.array;

public class SortedArrayRotated {
    public static void main(String[] args) {
        //{2,3,4,5,6,7,0,1} -> sorted array rotated 2 times. find the highest element
        //int[] arr = {7,8,15,70,1,4,5,6}; // 0,1,2,3,4,5,6,7 //{2,3,4,5,6,7,0,1}
        int[] arr = {7,8,15,70,1,4,5,6};//{7, 8, 15, 60, 70, 1, 5, 6};
        int target = 8;

        int highestOptimized = findHighestOptimized(arr);
        System.out.println(highestOptimized + " : Highest Optimized");

        int minOptimized = findMinimumOptimized(arr);
        System.out.println(minOptimized + " : Min Optimized");

        int targetOptimized = findTargetOptimized(arr, target);
        System.out.println(minOptimized + " : Index of targeted number Optimized");
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
    public static int findHighestOptimized(int[] arr){
        int low = 0, high = arr.length - 1;
        if(arr[high] > arr[low]) return arr[high];
        if(arr.length == 1) return arr[0];

        while(low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid + 1]) return arr[mid];
            if (arr[mid] < arr[mid - 1]) return arr[mid - 1];

            if(arr[mid] > arr[low]) high = mid - 1;
            else low = mid + 1;
        }
        return  -1;
    }

    public static int findMinimumOptimized(int[] arr){
        int low = 0, high = arr.length - 1;
        if(arr[high] > arr[low]) return low;
        if(arr.length == 1) return arr[0];

        while (low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > arr[mid + 1]) return arr[mid + 1];
            if(arr[mid] < arr[mid - 1]) return arr[mid];

            if(arr[mid] > arr[low]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static int findTargetOptimized(int[] arr, int target){
        int low = 0, high = arr.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            if(target == arr[mid]) return mid;
            if(arr[low] <= arr[mid]) {
                if(target >= arr[low] && target < arr[mid]) high = mid - 1;
                else low = mid + 1;
            }
            else {
                if(target > arr[mid] && target <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}
