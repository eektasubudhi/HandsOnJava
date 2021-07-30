package com.prac.array;

public class MyMergeSort {
    public static void main(String[] args) {
        int[] arr = {60,2,8,90,19,60};
        int low = 0;
        int high = arr.length-1;
        sortArray(arr, low, high);
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
    public static void sortArray(int[] arr, int low, int high){
        if(low<high) {
            int mid = (low + high) / 2;

            sortArray(arr, low,mid);
            sortArray(arr,mid+1,high);

            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr, int low,int mid, int high){
        System.out.println(mid+" mid "+high +" high "+ low+" low ");
        int[] left = new int[mid];
        int[] right = new int[high-mid];
        int counter = 0;
        int lCounter = 0;
        int rCounter = 0;
        for(int i =0;i<mid;i++){
            left[i]=arr[low+1];
        }
        for(int j = 0;j<high;j++){
            right[j]=arr[mid+1+j];
        }
        while (lCounter<mid && rCounter< high-mid){
            if(left[lCounter]<right[rCounter]){
                arr[counter]= left[lCounter];
                lCounter++;
            }
            else{
                arr[counter] = right[rCounter];
                rCounter++;
            }
            counter++;
        }
        while(lCounter<mid){
            arr[counter] = left[lCounter];
            lCounter++;
            counter++;
        }
        while(rCounter<high-mid){
            arr[counter] = right[rCounter];
            rCounter++;
            counter++;
        }

    }
}
