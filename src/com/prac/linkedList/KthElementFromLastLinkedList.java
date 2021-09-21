package com.prac.linkedList;

public class KthElementFromLastLinkedList {
    static int count = 0;

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

        int k = 2;
        //findKthElementFromLast(n1, k);
        findKthElementFromLastRecur(n1, k);

    }
    static void findKthElementFromLast(Node head, int k){
        Node current = head;
        Node prev = null;
        Node next =null;
        int count = 0;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        while (prev!=null){
            if(count == k) System.out.println("Element is : "+ prev.data);
            count++;
            prev = prev.next;
        }
    }
    static Node FromLastRecur(Node head){
        if(head.next == null) return head;
        Node last = FromLastRecur(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
    static void findKthElementFromLastRecur(Node head, int k){
        int count = 0;
        Node last = FromLastRecur(head.next);
        while (last != null){
            if(k == count) System.out.println("Element in rec is: "+ last.data);
            last = last.next;
            count++;
        }
    }
}
