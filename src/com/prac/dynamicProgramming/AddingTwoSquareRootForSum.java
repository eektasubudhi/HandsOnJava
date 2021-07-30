package com.prac.dynamicProgramming;

public class AddingTwoSquareRootForSum {
    public static void main(String[] args) {
        int num = 15; // find the least square roots which sums equals number.
        // o/p- 9 + 4 + 1 + 1
        //i.p = 13, o/p - 3^2 +2^2 = 9 + 4 = 13
        AddingTwoSquareRootForSum obj = new AddingTwoSquareRootForSum();
        //obj.findSquareRoots(num, num, num/2);
        obj.findSquareRootsIterative(num, num / 2);
    }
    public void findSquareRoots(int num, int sum, int highRng){
        if(highRng < 1 || sum == 0) return;
        if(highRng * highRng > num) findSquareRoots(num, num, highRng-1);
        else {
            sum = num - (highRng * highRng);
            System.out.println(highRng * highRng);
            findSquareRoots(num, sum, highRng-1);
        }

    }
    public void findSquareRootsIterative(int num, int highRng){
        int sum = num;
        for(int i = highRng; i > 0; i--){
            if (sum == 0) return;
            int square = i * i;
            if(square < num){
                sum = sum - square;
                System.out.println(i);
            }
        }
    }
}
