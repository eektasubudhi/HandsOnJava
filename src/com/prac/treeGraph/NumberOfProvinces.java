package com.prac.treeGraph;

public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}}; //{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        NumberOfProvinces obj = new NumberOfProvinces();
        int res = obj.findCircleNum(isConnected);
        System.out.println("Total number of provinces: " + res);
    }
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int[] isVisited = new int[isConnected.length];
        for(int i = 0; i < isConnected.length; i++) {
            if (isVisited[i] == 0) {
                getConnectedProvinces(isConnected, isVisited, i);
                count++;
            }
        }
        return count;
    }
    public void getConnectedProvinces(int[][] isConnected, int[] isVisited, int row){
        for(int j = 0; j < isConnected[0].length; j++) { //{{1,1,0},{1,1,0},{0,0,1}}
            if (isConnected[row][j] == 1 & isVisited[j] == 0) {
                isVisited[j] = 1;
                getConnectedProvinces(isConnected, isVisited, j);
            }
        }
    }
}
