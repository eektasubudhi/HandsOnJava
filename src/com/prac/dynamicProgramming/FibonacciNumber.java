package com.prac.dynamicProgramming;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 3;
        int result = fib(n);
        System.out.println(result+" : result");
    }
    public static int fib(int n){
        if (n <= 1) return n;
        int[] memo = new int[n+1];
        memo[0] = 0;
        memo[1] = 1;
        return fib(n, memo);
    }
    public static int fib(int n, int[] memo){
        if (n < 0) return 0;
        else if(memo[n] > 0) return memo[n];
        else{
            memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
            return memo[n];
        }
    }
}
