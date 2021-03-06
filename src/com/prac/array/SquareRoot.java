package com.prac.array;

public class SquareRoot {
    static int var;
    public static void main(String[] args) {
        //Find the square root of a number, if it is not a perfect square then return the nearest square root value
        int x = 11;
        //System.out.println(nearestSquareRoot(x));
        int low = 0;
        int high = x / 2;
        int previousHighest=0;
        int nextHighest=0;
        System.out.println(nearestSquareRoot(x,low,high, previousHighest, nextHighest));

        int sqAns = squareRoot(x);
        System.out.println("Optimized result new : " + sqAns);
    }

    static int nearestSquareRoot(int x, int low, int high, int previousHighest, int nextHighest){
        int mid = (low+high)/2;
        if (low>high) {
            if((x-(previousHighest*previousHighest))>((nextHighest*nextHighest)-x)) var = nextHighest;
            else var = previousHighest;
            return var;
        }
        if(mid*mid == x) {
            var = mid;
        }
        if(mid*mid > x){
            high = mid-1;
            nextHighest = mid;
            nearestSquareRoot(x, low, high, previousHighest, nextHighest);
        }
        if(mid*mid < x){
            low = mid+1;
            previousHighest = mid;
            nearestSquareRoot(x, low, high, previousHighest, nextHighest);
        }
        return var;
    }
    static int squareRoot(int x){
        if(x == 1 || x == 0) return x;
        int start = 1, end = x, ans = 0;
        while(start <= end){
            int mid = (start + end) / 2;
            if(mid * mid == x) return mid;
            if(mid * mid < x) {
                ans = mid;
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return ans;
    }

}