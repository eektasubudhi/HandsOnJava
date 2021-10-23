package com.prac.array;

public class ExponentRecursion {

    public static void main(String[] args) {
        int base = 3;
        int power = -5;
        ExponentRecursion ex = new ExponentRecursion();
        System.out.println(ex.power(base,power));
        //System.out.println(ex.ourPower(base,power));
    }

    public int power(int base, int power){
        if(power == 1) return base;
        if(power%2 == 0){
            return power(base*base, power/2);
        }
        else{
            return base*power(base*base, (power-1)/2);
        }

    }

    public int ourPower(int base, int power){
        if(power == 1) return base;

        return base*ourPower(base , power-1);

    }
}
/*
1-3,5 hold
2-3*[(3,4) ->x1] hold 3* (81)
3-3*3[(3,3) ->x2] = 3*(27) hold
4-3*3*3[(3,2) -> x3] = 3*(9) hold
5-3*3*3*3[(3,1) -> x4] = 3*[3]
--------------------------------------
3,5
3*[(3,4) ->x1]
3*3[(3,3) ->x2] = 3*3*(27)
3*3*3[(3,2) -> x3] = 3*3*3*(9)
3*3*3*3[(3,1) -> x4] = 3*3*3*3*[3]


p=50, n= convert 50 to decimal
n = log10 p
*/