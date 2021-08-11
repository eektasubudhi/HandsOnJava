package com.prac.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class FindPairValues {
    public static void main(String[] args) {
        /*Given two arrays, find a pair of values(one value from each array),
         * that cab be swapped so that the two arrays have the same sum */
        int[] arr1 = {4,1,2,1,1,2}; //sum = 14
        int[] arr2 = {3,6,3,3};     //sum = 20
        //Output -> {1,3}
        /*int[] arr1 = {4,1,2,1,1,2}; //sum = 11
        int[] arr2 = {3,6,3,3};     //sum = 15

        int[] arr1 = {5, 7, 5, 1}; //sum = 18
        int[] arr2 = {1, 2, 4, 3};     //sum = 10

        int[] arr1 = {5, 7, 5, 1, 2}; //sum = 20
        int[] arr2 = {1, 2, 4, 5};     //sum = 12

        sum1-a+b = sum2-b+a
        sum1-a-a -sum2 = -b-b
        sum1 -2a-sum2 =-2b
        sum1-sum2= 2a-2b
        a-b = (sum1-sum2)/2

         */
        int[] res1 = givePairs(arr1, arr2);
        for(int a: res1) System.out.println(a);

        int[] res2 = givePairsOptimized(arr1, arr2);
        for(int a : res2) System.out.println(a);

    }
    public static int[] givePairsOptimized(int[] arr1, int[] arr2){
        int[] result1 = new int[2];
        int sum1 = 0;
        int sum2 = 0;
        for(int i : arr1) sum1+=i;
        for(int i : arr2) sum2+=i;
        int arr1Counter = 0;
        int exprsn = (sum1 - sum2) / 2;
        //a - b = exprsn

        return result1;
    }
    public static int[] givePairs(int[] arr1, int[] arr2){
        int[] result = new int[2];
        int sum1 = 0;
        int sum2 = 0;
        for(int i : arr1) sum1 += i;
        for(int i : arr2) sum2 += i;
        int exprsn = (sum1 - sum2) / 2;
        for(int j = 0; j < arr1.length; j++){
            for(int k = 0; k < arr2.length; k++){
                if(arr1[j] - arr2[k] == exprsn){
                    result[0] = arr1[j];
                    result[1] = arr2[k];
                }
            }
        }
        return result;
    }
}
