package com.prac.linkedList;

import java.util.HashSet;
import java.util.Hashtable;

public class LoopDetectionLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(6);
        Node n2 = new Node(1);
        Node n3 = new Node(7);
        Node n4 = new Node(8);
        Node n5 = new Node(9);

        n1.next = n2;
        n1.next.next = n3;
        n1.next.next.next = n4;
        n1.next.next.next.next = n5;
        //n5.next = n3;

        boolean res = loopDetect(n1);
        System.out.println("Linked List has a loop : "+ res);

        Node result = loopDetectTheNode(n1);
        if (result!=null) System.out.println(result.data+ " : cycle starting node");
        else System.out.println("Not a cyclic linked list");
    }
    public static  boolean loopDetect(Node head){
        Node fstPtr = head;
        Node slwPtr = head;

        while(fstPtr!=null & fstPtr.next!=null){
            fstPtr = fstPtr.next.next;
            slwPtr = slwPtr.next;
            if(fstPtr == slwPtr) return true;
        }
        return false;
    }
    public static Node loopDetectTheNode(Node head){
        HashSet<Node> hs = new HashSet<>();
        while(head!=null){
            if(hs.contains(head)) return head;
            else hs.add(head);
            head = head.next;
        }
        return head;
    }
}
