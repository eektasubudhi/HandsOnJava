package com.prac.array;

public class PolynomialNaive {

    public static void main(String[] args) {
        int[] arr = {1,2};
        int sum = arr[0];
        int v =-5;
        int product = 1;

        for(int i =0; i<arr.length;i++){
            product = product*v;
            sum += arr[i]* product;
        }
        System.out.println(sum);

    }
}
