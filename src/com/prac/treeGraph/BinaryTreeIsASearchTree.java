package com.prac.treeGraph;

public class BinaryTreeIsASearchTree {
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
        boolean result = isBinarySearchTree(root);
        System.out.println("It is a binary search tree: " + result);
    }

    public static boolean isBinarySearchTree(TreeNode root){
        if(root == null) return true;
        TreeNode l = null;
        TreeNode r = null;

        return isBst(root, l, r);
    }
    public static boolean isBst(TreeNode root, TreeNode left, TreeNode right){
        if(root == null) return true;
        if(left != null && left.val >= root.val) return false;
        if(right != null && right.val <= root.val) return false;
        if(!isBst(root.left, left, root) || !isBst(root.right, root, right)) return false;
        return true;
    }
}
