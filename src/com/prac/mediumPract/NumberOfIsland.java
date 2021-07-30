package com.prac.mediumPract;

public class NumberOfIsland {
    public static void main(String[] args) {
       // int grid[][] = {{ 1, 1, 0}, { 0, 1, 0}, { 1, 0, 0}, { 0, 0, 0}};
        int grid[][] = new int[][] { { 1, 1, 0, 0, 0 },
                                     { 0, 1, 0, 0, 1 },
                                     { 0, 0, 1, 0, 1 },
                                     { 0, 0, 0, 0, 0 },
                                     { 1, 0, 1, 0, 1 } };
        int numberOfIsland = isLandCount(grid, grid.length, grid[0].length);
        System.out.println("Numbers of Island in the matrix : "+ numberOfIsland);

    }
    public static int isLandCount(int[][] grid, int row, int col){
        int count = 0;
        boolean[][] isVisited = new boolean[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1 && (!isVisited[i][j])){
                    isVisited[i][j] = true;
                    dfsNbr(grid, isVisited, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfsNbr(int[][] grid, boolean[][] isVisited, int row, int col){
        if(row > 0 && grid[row - 1][col] == 1 && (!isVisited[row - 1][col])){
            isVisited[row - 1][col] = true;
            dfsNbr(grid, isVisited, row - 1, col);
        }
        if(row < grid.length - 1 && grid[row + 1][col] == 1 && (!isVisited[row + 1][col])){
            isVisited[row + 1][col] = true;
            dfsNbr(grid, isVisited, row + 1, col);
        }
        if(col > 0 && grid[row][col - 1] == 1 && (!isVisited[row][col - 1])){
            isVisited[row][col - 1] = true;
            dfsNbr(grid, isVisited, row, col - 1);
        }
        if(col < grid[0].length - 1 && grid[row][col + 1] == 1 && (!isVisited[row][col + 1])){
            isVisited[row][col + 1] = true;
            dfsNbr(grid, isVisited, row, col + 1);
        }
        if(row > 0 && col > 0 && grid[row - 1][col - 1] == 1 && (!isVisited[row - 1][col - 1])){
            isVisited[row - 1][col - 1] = true;
            dfsNbr(grid, isVisited, row - 1, col - 1);
        }
        if(row < grid.length - 1 && col < grid[0].length - 1 && grid[row + 1][col + 1] == 1 && (!isVisited[row + 1][col + 1])){
            isVisited[row + 1][col + 1] = true;
            dfsNbr(grid, isVisited, row + 1, col + 1);
        }
        if(row > 0 && col < grid[0].length - 1 && grid[row - 1][col + 1] == 1 && (!isVisited[row - 1][col + 1])){
            isVisited[row - 1][col + 1] = true;
            dfsNbr(grid, isVisited, row - 1, col + 1);
        }
        if(row < grid.length - 1 && col > 0 && grid[row + 1][col - 1] == 1 && (!isVisited[row + 1][col - 1])){
            isVisited[row + 1][col - 1] = true;
            dfsNbr(grid, isVisited, row + 1, col - 1);
        }
        else return;
    }
}
