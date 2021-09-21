package com.prac.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKLinkedLists {
    public static class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(7);

        Node n4 = new Node(1);
        Node n5 = new Node(2);

        Node n6 = new Node(4);
        Node n7 = new Node(5);
        Node n8 = new Node(6);
        Node n9 = new Node(9);

        n1.next = n2;
        n2.next = n3;

        n4.next = n5;

        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        Node[] lists = {n1, n4, n6};

        MergeKLinkedLists obj = new MergeKLinkedLists();

        //Node result = obj.mergeLinkedLists(lists); // approach1
        Node result = obj.mergeLinkedLists2(lists); // approach2

        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public Node mergeLinkedLists(Node[] lists){
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        Node head = mergeTwoLinkedList(lists[0], lists[1]);

        for(int i = 2; i < lists.length; i++){
           head = mergeTwoLinkedList(head, lists[i]);
        }
        return head;
    }
    public Node mergeTwoLinkedList(Node n1, Node n2){
        Node hd = new Node(0);
        Node ans = hd;
        while(n1 != null && n2 != null){
            if(n1.val < n2.val) {
                hd.next = n1;
                hd = hd.next;
                n1 = n1.next;
            } else {
                hd.next = n2;
                hd = hd.next;
                n2 = n2.next;
            }
        }
        if(n1 == null) hd.next = n2;
        if(n2 == null) hd.next = n1;
        return ans.next;
    }
    public Node mergeLinkedLists2(Node[] lists){
        List<Integer> allLinkedList = new ArrayList<>();
        for(Node n : lists){
            while(n != null){
                allLinkedList.add(n.val);
                n = n.next;
            }
        }
        Collections.sort(allLinkedList);
        Node head = new Node(-1);
        Node answer = head;
        for (int i = 0; i < allLinkedList.size(); i++){
            Node temp = new Node(allLinkedList.get(i));
            head.next = temp;
            head = head.next;
        }
        return answer.next;
    }
}
