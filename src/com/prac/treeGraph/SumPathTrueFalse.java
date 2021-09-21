package com.prac.treeGraph;

public class SumPathTrueFalse {
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

        boolean res = SumToTarget(root, 11);
        System.out.println("The tree have complete path root till leaf which sum to the given target number: " + res);
    }
    public static boolean SumToTarget(TreeNode root, int target){
        if(root == null) return false;
        target = target - root.val;
        if(root.left == null && root.right == null) return (target == 0);
        return (SumToTarget(root.left, target) || SumToTarget(root.right, target));
    }
}
