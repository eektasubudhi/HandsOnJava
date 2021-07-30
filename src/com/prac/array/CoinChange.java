package com.prac.array;

public class CoinChange {
    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        //cc.getMinNoOfCoins(50);
        System.out.println(cc.getMinNoOfCoins(50));
    }
    public int getMinNoOfCoins(int cents){
        int noOfquart = cents/25;
        cents = cents - (noOfquart*25);
        int noOfdime = cents/10;
        cents = cents - (noOfdime*10);
        int noofnickel = cents/5;
        cents = cents - (noofnickel*5);
        int noofpenny = cents/1;

        return noOfquart+noOfdime+noofnickel+noofpenny;
    }
}
