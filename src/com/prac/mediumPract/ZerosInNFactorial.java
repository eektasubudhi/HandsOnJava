package com.prac.mediumPract;

public class ZerosInNFactorial {
    public static void main(String[] args) {
        int number = 12;
        // count trailing zeros in the number factorial.i.e 120!
        ZerosInNFactorial obj = new ZerosInNFactorial();
        int count = obj.countOfZeroNew(number);
        int count2 = obj.countOfZero(number);
        System.out.println(count+" : number of Zeros in (new)"+ number +" factorial");
        System.out.println(count2+" : number of Zeros in (old)"+ number +" factorial");
    }
    public int countOfZero(int num){
        int count = 0;
        for(int i = 2; i <= num; i++){
            int cnt = 0;
            int factor = i;
            while(factor % 5 == 0){
                cnt++;
                factor = factor / 5;
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
