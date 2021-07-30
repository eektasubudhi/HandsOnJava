package com.prac.dynamicProgramming;

public class Power {
    public static void main(String[] args) {
        Power pow = new Power();
        double ans = pow.myPow(5.0, 3);
        System.out.println(ans+" : Answer");
    }
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        double current_product = x;
        for (long i = N; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                ans = ans * current_product;
            }
            current_product = current_product * current_product;
        }
        return ans;
    }
}
