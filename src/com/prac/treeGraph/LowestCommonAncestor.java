package com.prac.treeGraph;

public class LowestCommonAncestor {
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

        LowestCommonAncestor obj = new LowestCommonAncestor();
        TreeNode result = obj.findLowestCommonAncestor(root, left, right);
        System.out.println("Common ancestor of p and q: " +result.val);
    }

    public TreeNode findLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null;
        if(root == p || root == q) return root;

        TreeNode left = findLowestCommonAncestor(root.left, p, q);
        TreeNode right = findLowestCommonAncestor(root.right, p, q);

        if(left == null && right == null) return null;
        if(left != null & right != null) return root;
        if(left != null && right == null) return left;
        else return right;
    }
}
