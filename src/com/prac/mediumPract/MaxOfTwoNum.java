package com.prac.mediumPract;

import java.util.Arrays;
import java.util.Comparator;

public class MaxOfTwoNum {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 100;

        maxOfTwo(num1, num2);
    }
    public static void maxOfTwo(int n1, int n2){
        int[] resArr = new int[2];
        resArr[0] = n1;
        resArr[1] = n2;
        Arrays.sort(resArr);
        System.out.println("Max of two num: "+resArr[1]);
        System.out.println("Min of two num: "+resArr[0]);
    }
    /*public static void maxOfTwo(int num1, int num2){
        NumberComparator cmp = new NumberComparator();
        System.out.println(cmp.compare(num1,num2));
    }
    public static class NumberComparator implements Comparator<Integer>{
        public int compare(Integer i1, Integer i2){
            return i1.compareTo(i2);
        }
    }*/
}
