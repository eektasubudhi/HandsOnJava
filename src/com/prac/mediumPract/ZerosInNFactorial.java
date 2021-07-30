package com.prac.mediumPract;

public class ZerosInNFactorial {
    public static void main(String[] args) {
        int number = 120;
        // count trailing zeros in the number factorial.i.e 120!
        ZerosInNFactorial obj = new ZerosInNFactorial();
        //int count = obj.countOfZeroNew(number);
        int count = obj.countOfZero(number);
        System.out.println(count+" : number of Zeros in"+ number +" factorial");
    }
    public int countOfZero(int num){
        int count = 0;
        for(int i = 2; i <= num; i++){
            int cnt = 0;
            while(i % 5 == 0){
                cnt++;
                i = i / 5;
            }
            count += cnt;
        }
        return count;
    }
    public int countOfZeroNew(int num){
        int count = 0;
        for(int i = 5; num / i > 0; i = i * 5){
            //System.out.println(num / i + " : mine");
            count = count + num / i;
        }
        return count;
    }
}
