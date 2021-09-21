package com.prac.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class AllPathFromSourceToDestination {
    List<List<Integer>> result = new ArrayList<>();
    int target = 0;
    int source = 0;

    public static void main(String[] args) {
        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};//{{1,2,3},{2},{3},{}};
        // i/p -> {{4,3,1},{3,2,4},{3},{4},{}}; 0/p expected -> [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
        AllPathFromSourceToDestination o = new AllPathFromSourceToDestination();
        o.allPathsSourceTarget(graph);
        for (List<Integer> l : o.result){
            for(int i : l){
                System.out.println(i);
            }
            System.out.println("------------");
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int[] visited = new int[graph[0].length];
        if(graph == null ||graph.length == 0){
            return result;
        }
        List<Integer> l = new ArrayList<Integer>();
        l.add(0);
        target = graph.length - 1;
        dfs(graph,l, 0);
        return result;
    }
    public void dfs(int[][] graph, List<Integer> curr, int node){
        if(node == target){
            result.add(new ArrayList(curr));
            return;
        }
        for(int i : graph[node]){ //{{4,3,1},{3,2,4},{3},{4},{}}
            curr.add(i);
            dfs(graph, curr, i);
            curr.remove(curr.size() - 1);
        }

    }
}
