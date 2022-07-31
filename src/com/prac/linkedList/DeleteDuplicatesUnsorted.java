package com.prac.linkedList;

import java.util.HashMap;
import java.util.Map;

public class DeleteDuplicatesUnsorted {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int v){
            this.val = v;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode nodeA = new ListNode(1);
        ListNode nodeB = new ListNode(3);
        ListNode nodeC = new ListNode(1);
        ListNode nodeD = new ListNode(2);
        ListNode nodeE = new ListNode(2);
        ListNode nodeF = new ListNode(5);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;

        ListNode res= deleteDuplicatesUnsorted(nodeA);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode deleteDuplicatesUnsorted(ListNode head) {
        if(head == null) return null;
        Map<Integer, Integer> countMap = new HashMap<>();

        ListNode temp = head;
        while(temp != null){
            countMap.put(temp.val, countMap.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }
        ListNode curr = new ListNode(-1);
        curr.next = head;
        ListNode prev = curr, post = head;

        while(post != null){
            if(countMap.get(post.val)>1){
                prev.next = post.next;
            }else{
                prev = post;
            }
            post = post.next;
        }
        return curr.next;
    }
}
