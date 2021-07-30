package com.prac.array;

public class SquareRoot {
    static int var;
    public static void main(String[] args) {
        //Find the square root of a number, if it is not a perfect square then return the nearest square root value
        int x = 624;
        //System.out.println(nearestSquareRoot(x));
        int low = 0;
        int high = x / 2;
        int previousHighest=0;
        int nextHighest=0;
        System.out.println(nearestSquareRoot(x,low,high, previousHighest, nextHighest));
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

}