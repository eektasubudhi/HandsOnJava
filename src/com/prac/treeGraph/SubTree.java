package com.prac.treeGraph;

public class SubTree {
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
        
        TreeNode left1 = new TreeNode(-1);
        TreeNode right1 = new TreeNode(3);
        TreeNode root2 = new TreeNode(2, left1, right1);
        
        SubTree obj = new SubTree();
        boolean result = obj.isSubtree(root, root2);
        System.out.println("Root2 is a subtree of root1 : " +result);
    }
    public boolean isSubtree(TreeNode root1, TreeNode root2){
        if(root2 == null) return true;
        if(root1 == null) return false;

        else if(root1.val == root2.val && isMatches(root1, root2)) return true;

        return (isSubtree(root1.left,root2) || isSubtree(root1.right, root2));
    }

    public boolean isMatches(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null) return true;
        else if(r1 == null || r2 == null) return false;
        else if(r1.val != r2.val) return false;
        else return isMatches(r1.left, r2.left) && isMatches(r1.right, r2.right);
    }

}
