package com.prac.stackQueue;

public class sortInPlace {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,4,5,6};

        int length = inPlaceRemoveDuplicateInSortedWay(arr);
        System.out.println("Length of sorted part is: " + length);
        for(int i : arr) System.out.println(i + "--");
    }
    public static int inPlaceRemoveDuplicateInSortedWay(int[] arr){
        if(arr.length == 0) return 0;
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[j] != arr[i]){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return j;
    }
}
