package com.prac.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] bin = {2,4,5,7,9,10,20}; //sorted array
        int find = 10;
        int high = bin.length-1;
        int low = 0;
        int index = binarySearchFun(bin, find, high, low);
      //  int indexIter = binarySearchIter(bin, find, low, high);
        System.out.println(index);
      //  System.out.println(indexIter+"iter");
    }
    public static int binarySearchFun(int[] bin, int find, int high, int low){
        int mid = (high+low)/2;
        if(high < low) return -1;
        if(low == high) {
            if(find == bin[low]) return low;
            else return -1;
        }
        if(bin[mid] == find) return mid;
        if (find < bin[mid]){
            high = mid-1;
            //high = mid;
            return binarySearchFun(bin, find, high, low);
        }
        else {
            low = mid+1;
            return binarySearchFun(bin, find, high, low);
        }
    }

   /* public static int binarySearchIter(int[] bin, int find, int low, int high){
        int index=-1;;
        while(low<= high){
            int  mid = (low+high)/2;
            if(bin[mid] == find) return mid;
            if(find < bin[mid]) high = mid-1;
            else low= mid+1;
        }
        return index;
    }*/
}
