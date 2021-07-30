package com.prac.mediumPract;

public class SwapTwoNumbers {
    public static void main(String[] args){
        int first = 3;
        int last = 6;
        // swap two numbers without using variable.

        swapTwoNumbersPlusMinus(first, last);
        swapTwoNumbersMultiply(first, last);
    }
    public static void swapTwoNumbersPlusMinus(int f, int l){
        f = f + l;
        l = f - l ;
        f = f - l;

        System.out.println("first (Plus minus): "+f);
        System.out.println("last (Plus minus) : "+l);
    }
    public static void swapTwoNumbersMultiply(int f, int l){
        f = f * l;
        l = f / l;
        f = f / l;

        System.out.println("first (Multiply) : "+f);
        System.out.println("last (Multiply) : "+l);
    }
}
