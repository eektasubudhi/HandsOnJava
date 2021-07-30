package com.prac.mediumPract;

import java.util.ArrayList;
import java.util.List;

public class ArraySumOfIncrement {
    public static int index = 0;

    public static void main(String[] args) {
        int[] arr = {2,7,1,9,5,5,2,1,2}; // add same number of elements as its index
        // output - 2, (7+1=)8, (9+5+5=)19, (remaining 2+1+2=)5
        List<Integer> res = sumOfSeries(arr);
        for (int i : res) System.out.println(i);
    }
    public static List<Integer> sumOfSeries(int[] arr){
        int i = 0;
        List<Integer> result = new ArrayList<>();
        for(int count = 1; count < arr.length && i < arr.length; count++){
            int sum = 0;
            int iter = 1;
            while(iter <= count && i < arr.length){
                sum = sum + arr[i];
                i++;
                iter++;
            }
            result.add(sum);
        }
        return result;
    }
}
