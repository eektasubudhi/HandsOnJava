package com.prac.treeGraph;

public class MergingTwoTrees {
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
        TreeNode root1 = new TreeNode(6, left, right);
        TreeNode n1 = new TreeNode(-1);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(13);

        left.left = n1;
        left.right = n2;
        right.left = n3;
        right.right = n4;

        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(5, left1, right1);
        TreeNode m1 = new TreeNode(1);
        TreeNode m2 = new TreeNode(3);
        //TreeNode m3 = new TreeNode(8);
        TreeNode m4 = new TreeNode(13);

        left1.left = m1;
        left1.right = m2;
        //right1.left = m3;
        right1.right = m4;

        TreeNode node = mergeTrees(root1, root2);
        System.out.println(node.val);
        System.out.println(node.left.val);
        System.out.println(node.left.left.val);
        System.out.println(node.left.right.val);
        System.out.println(node.right.val);
        System.out.println(node.right.left.val);
        System.out.println(node.right.right.val);
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2){
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
}
