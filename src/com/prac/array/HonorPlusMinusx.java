package com.prac.array;

public class HonorPlusMinusx {
    public static void main(String[] args) {
        int[] horArr = {1,2,3,4}; // polynomial equation solve
        int v = -2;
        int[] even = new int[horArr.length/2];
        int[] odd = new int[horArr.length/2];
        int evenCounter =0;
        int oddCounter =0;
        for(int i =0; i< horArr.length;i++){
            if(i%2==0){
                odd[evenCounter++] = horArr[i];
            }
            else{
                even[oddCounter++] = horArr[i];
            }
        }
        int sumEven = honorPolyCalc(even,v);
        System.out.println(sumEven+"sum even");
        int sumOdd = honorPolyCalc(odd,v);
        System.out.println(sumOdd+"sum odd");
        int sum = sumEven+sumOdd;
        System.out.println(sum);
    }
    public static int honorPolyCalc(int[] horArr, int v){
        int sum = horArr[horArr.length-1];
        for(int i = horArr.length-2;i>=0;i--){
                sum = sum*v + horArr[i];
        }
        return sum;
    }
}
