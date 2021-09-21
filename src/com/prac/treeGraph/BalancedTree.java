package com.prac.treeGraph;

public class BalancedTree {
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
        TreeNode n1 = new TreeNode(-1);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(13);

        left.left = n1;
        left.right = n2;
        right.left = n3;
        right.right = n4;
        boolean result = isBalanced(root);
        System.out.println("It is a balance binary tree: " + result);
    }
    public static boolean isBalanced(TreeNode root){
        if(root == null) return true;
        return (Math.abs(height(root.left) - height(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right));
    }
    public static int height(TreeNode root){
        if(root == null) return -1;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

}
