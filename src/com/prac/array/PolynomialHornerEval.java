package com.prac.array;

public class PolynomialHornerEval {
    public static void main(String[] args) {
        int[] horArr = {1,2};
        int v = -5;
        int sum = horArr[horArr.length-1];
        for(int i = horArr.length-2;i>=0;i--){
            sum = sum*v + horArr[i];
        }
        System.out.println(sum);
    }
}
