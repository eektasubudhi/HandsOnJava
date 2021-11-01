package com.prac.array;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumbersLessThanN {
    public static void main(String[] args) {
        int n = 19;
        int cnt = findPrimesLessThanN(n);
        System.out.println("Number of primes less than n is : " + cnt);
    }
    public static int findPrimesLessThanN(int n){
        if(n <= 2) return 0;
        boolean[] counter = new boolean[n];
        for(int i = 2; i < (int)Math.sqrt(n); i++){
            if(counter[i] == false){
                for(int j = i*i; j < n; j += i){
                    counter[j] = true;
                }
            }
        }
        int count = 0;
        for(int i = 2; i < n; i++){
            if(counter[i] == false) count++;
        }
        return count;
    }
}
