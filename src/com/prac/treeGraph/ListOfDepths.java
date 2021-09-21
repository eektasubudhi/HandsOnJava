package com.prac.treeGraph;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListOfDepths {
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

        List<LinkedList<TreeNode>> res = ListTheDepths(root);
        for(LinkedList<TreeNode> l : res){
            for(TreeNode t : l){
                System.out.println(t.val);
            }
            System.out.println("-------------");
        }
    }

    public static List<LinkedList<TreeNode>> ListTheDepths(TreeNode root){
        List<LinkedList<TreeNode>> result = new ArrayList<>();
        LinkedList<TreeNode> current = new LinkedList<>();
        if(root != null){
            current.add(root);
        }
        while(!current.isEmpty()){
            result.add(current);
            LinkedList<TreeNode> parent = current;
            current = new LinkedList<>();
            for(TreeNode t : parent){
                if(t.left != null) current.add(t.left);
                if(t.right != null) current.add(t.right);
            }
        }
        return result;
    }
}
