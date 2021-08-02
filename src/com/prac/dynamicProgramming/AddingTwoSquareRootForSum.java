package com.prac.dynamicProgramming;

public class AddingTwoSquareRootForSum {
    public static void main(String[] args) {
        int num = 100; // find the least square roots which sums equals number.
        // o/p- 9 + 4 + 1 + 1
        //i.p = 13, o/p - 3^2 +2^2 = 9 + 4 = 13
        AddingTwoSquareRootForSum obj = new AddingTwoSquareRootForSum();
        //obj.findSquareRoots(num, num, num/2);
        int res = obj.findSquareRootsIterative(num);
        System.out.println(res);
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
    public int findSquareRootsIterative(int num){
        if(num <= 3) return num;
        int sum = num;
        for(int i = 1; i <= num / 2; i++){
            int square = i * i;
            if(square > num) break;
            else{
                sum = Math.min(sum, 1 + findSquareRootsIterative(num - square));
            }
        }
        return sum;
    }
}
