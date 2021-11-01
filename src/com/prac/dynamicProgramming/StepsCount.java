package com.prac.dynamicProgramming;

public class StepsCount {
    public static void main(String[] args) {
        int n = 2;
        int probability = countSteps(n);
        System.out.println(probability+" : recursion without memo");

        int[] memo = new int[n+1];
        int probabilityMemo = memoCountSteps(n, memo);
        System.out.println(probabilityMemo+" : recursion with memo");
    }
    public static int countSteps(int n){
        if (n < 0) return 0;
        if (n == 0) return  1;
        return countSteps(n-1)+countSteps(n-2)+countSteps(n-3);
    }
    public static int memoCountSteps(int n, int[] memo){
        if(n < 0) return 0;
        else if(n == 0) return 1;
        else if(memo[n] > 0){
            return memo[n];
        }
        else{
            memo[n] = memoCountSteps(n-1, memo) + memoCountSteps(n-2, memo) + memoCountSteps(n-3, memo);
            return memo[n];
        }
    }

}
