package com.prac.linkedList;

import java.util.HashSet;

public class IntersectionLinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int val){
            data = val;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(6);
        Node n2 = new Node(1);
        Node n3 = new Node(7);
        Node n4 = new Node(8);

        Node n5 = new Node(9);
        Node n6 = new Node(10);
        Node n7 = new Node(11);

        n1.next = n2;
        n1.next.next = n3;
        n1.next.next.next = n4;

        n5.next = n6;
        n6.next = n7;

        boolean result = isIntersecting(n1, n5);
        System.out.println("The two linked list are intersecting: "+result);
    }
    public static boolean isIntersecting(Node head1, Node head2){
        HashSet<Node> hs = new HashSet<>();
        while (head1 != null){
            hs.add(head1);
            head1 = head1.next;
        }
        while (head2 != null){
            if(hs.contains(head2)) return true;
            head2 = head2.next;
        }
        return false;
    }
}
