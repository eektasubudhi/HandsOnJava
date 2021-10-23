package com.prac.treeGraph;

import java.util.HashMap;
import java.util.Map;

public class SumPathCount {
    int target;
    static int count = 0;
    Map<Integer, Integer> map = new HashMap<>();

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x){
            this.val = x;
        }
        TreeNode(int v, TreeNode l, TreeNode r){
            this.val = v;
            this.left = l;
            this.right = r;
        }
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(10);
        TreeNode root = new TreeNode(6, left, right);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(8);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(13);

        left.left = n1;
        left.right = n2;
        right.left = n3;
        right.right = n4;

        int result = getAllPathsWithTheSum(root, 16);
        System.out.println("Number of paths with given sum : " + result);

        SumPathCount obj = new SumPathCount();
        obj.getAllPathsWithTheSumOptimized(root, 16);
        System.out.println("Number of paths with given sum optimized version : " + count);
    }
    // way -1
    public static int getAllPathsWithTheSum(TreeNode root, int target){
        if(root == null) return 0;
        int rootPath = countPaths(root, target, 0);

        int leftPath = getAllPathsWithTheSum(root.left, target);
        int rightPath = getAllPathsWithTheSum(root.right, target);

        return rootPath + leftPath + rightPath;
    }
    public static int countPaths(TreeNode node, int target, int curr){
        if (node == null) return 0;
        curr += node.val;

        int totalPath = 0;
        if(curr == target) totalPath++;

        totalPath += countPaths(node.left, target, curr);
        totalPath += countPaths(node.right, target, curr);

        return totalPath;
    }

    //way -2
    public int getAllPathsWithTheSumOptimized(TreeNode root, int k){
        this.target = k;
        countOfAllPath(root, 0);
        return count;
    }
    public void countOfAllPath(TreeNode node, int curr){
        if (node == null) return;

        curr += node.val;
        if(curr == target) count++;

        count += map.getOrDefault(curr - target, 0);
        map.put(curr, map.getOrDefault(curr, 0) + 1);

        countOfAllPath(node.left, curr);
        countOfAllPath(node.right, curr);

        map.put(curr, map.get(curr) - 1);
    }
}
