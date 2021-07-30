package com.prac.array;

public class MaxMinOptimal {
    public static void main(String[] args) {
        int[] arr = {2,6}; // find max and 2nd max

        int lag = arr[0];
        int sclrg = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>lag){
                lag = arr[i];
            }
            if(arr[i]>sclrg && arr[i]< lag){
                sclrg = arr[i];
            }
        }
        System.out.println(lag+"largest");
        System.out.println(sclrg+"sec largest");
    }
}
