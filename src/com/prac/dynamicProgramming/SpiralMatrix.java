package com.prac.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        List<Integer> res = traverseMatrixSpiral(matrix);
        for (int i : res) System.out.println(i);
    }
    public static List<Integer> traverseMatrixSpiral(int[][] matrix){
       List<Integer> result = new ArrayList<>();
       int rows = matrix.length, cols = matrix[0].length;
       int left = 0, up = 0;
       int right = cols - 1, down = rows - 1;

       while (result.size() < rows * cols){
           for(int col = left; col <= right; col++){
               result.add(matrix[up][col]);
           }
           for(int row = up + 1; row <= down; row++){
               result.add(matrix[row][right]);
           }
           if(up != down){
               for (int col = right - 1; col >= left; col--){
                   result.add(matrix[down][col]);
               }
           }
           if(left != right){
               for (int row = down - 1;  row > up; row--){
                   result.add(matrix[row][left]);
               }
           }
           left++;
           right--;
           up++;
           down--;
       }

       return result;
    }
}
