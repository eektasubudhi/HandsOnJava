package com.prac.dynamicProgramming;

public class MinimumSumPath {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3},
                        {4, 5, 6},
                        {2, 4, 6}};
        MinimumSumPath obj = new MinimumSumPath();
        int sum = obj.calculateMinSumPath(grid);
        System.out.println("The min sum of path from top left to bottom right is: " + sum);
    }
    public int calculateMinSumPath(int[][] grid){
        for(int i = grid.length - 1; i >= 0; i--){
            for(int j = grid[0].length - 1; j >= 0; j--){
                if(i == grid.length - 1 && j != grid[0].length - 1)
                    grid[i][j] = grid[i][j] + grid[i][j + 1];
                else if(i != grid.length - 1 && j == grid[0].length - 1)
                    grid[i][j] = grid[i][j] + grid[i + 1][j];
                else if(i != grid.length - 1 && j != grid[0].length - 1)
                    grid[i][j] = grid[i][j] + Math.min(grid[i][j + 1], grid[i +1][j]);
            }
        }
        return grid[0][0];
    }
}
