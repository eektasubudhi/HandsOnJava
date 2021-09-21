package com.prac.treeGraph;

public class BinarySearchTreeWithMinimalHeight {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
        TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        int[] arr = {-10, -1, 4, 9, 10};
        BinarySearchTreeWithMinimalHeight obj = new BinarySearchTreeWithMinimalHeight();
        TreeNode node = obj.createBinaryTreeWithMinHeight(arr);
        System.out.println(node.val);
        System.out.println(node.left.val);
        System.out.println(node.left.right.val);
        System.out.println(node.right.val);
        System.out.println(node.right.right.val);
    }
    public TreeNode createBinaryTreeWithMinHeight(int[] arr){
        TreeNode res = createTree(arr, 0, arr.length - 1);
        return res;
    }
    public TreeNode createTree(int[] arr, int left, int right){
        if(left > right) return null;
        int mid = (left + right) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = createTree(arr, left, mid - 1);
        n.right = createTree(arr, mid + 1, right);
        return n;
    }
}
