package com.prac.treeGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RoomsKeys {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1);
       // l.add(3);
        List<Integer> l2 = new ArrayList<>();
        l2.add(2);
       // l2.add(0);
        //l2.add(1);
        List<Integer> l3 = new ArrayList<>();
        l3.add(3);
        List<Integer> l4 = new ArrayList<>();
        //l4.add(0);
        Collections.addAll(rooms, l, l2, l3, l4);

        RoomsKeys obj = new RoomsKeys();
        boolean res = obj.canVisitAllRooms(rooms);
        System.out.println(res);
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] visited = new int[rooms.size()];
            if(visited[0] == 0){
                dfs(rooms, visited, 0);
            }

        for(int i : visited){
            if(i == 0) return false;
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms, int[] visited, int row){
        if(visited[row] == 0){
            visited[row] = 1;
             for(Integer i : rooms.get(row)){//[[1],[2],[3],[]]
                    dfs(rooms, visited, i);
                    //visited[row] = 0;
             }
        }
    }
}
