package com.prac.mediumPract;

public class TicTacWin {
    public static void main(String[] args) {
        int[][] ticTacToe = new int[][]{{'x','o','x'},
                                        {'o','o','x'},
                                        {'x','o','o'}};

        boolean result = hasAWinner(ticTacToe);
        System.out.println("The person won the game: "+result);
    }
    public static boolean hasAWinner(int[][] ticTac){
        boolean xWon = false;
        boolean oWon = false;
        for(int i = 0; i < ticTac.length; i++){
            for (int j = 0; j < ticTac[0].length; j++){
                if(ticTac[i][j] == 'x'){

                }else{

                }
            }
        }
        return false;
    }
}
