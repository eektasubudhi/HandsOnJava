package com.prac.array;

public class MatrixLearn {

    //1. create matrix print in tabular view
    //2. show the diagonal
    //3. given position -> print neighboring elements
    //4. find an element (position i,j)
    public static void main(String[] args) {
        int count = 1;
        int[][] a = new int[4][4];
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                a[row][col] = count++;
                System.out.print(a[row][col]+ " ");
            }
            System.out.println();
        }
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                if(row == col) System.out.println(a[row][col]+" diagonal position");

            }
        }
        int row =1;
        int col =1;

            if(row >= 0 && col < a.length-1) System.out.println(" middle neighbour "+ a[row][col+1]);
            if(row >= 0 && col>0) System.out.println(" middle neighbour "+ a[row][col-1]);
            if(row > 0 && col < a.length-1 ) System.out.println(" upper neighbour "+ a[row-1][col+1]+" "+a[row-1][col]);
            if(row > 0 && col>0 && row<a.length-1) System.out.println(" upper neighbour "+a[row-1][col-1]);
            if(col < a.length-1 && row<a.length-1) System.out.println(" bottom neighbour "+ a[row+1][col+1]+" "+a[row+1][col]);
            if(col>0 && row<a.length-1) System.out.println(" bottom neighbour "+a[row+1][col-1]);

    }

}
