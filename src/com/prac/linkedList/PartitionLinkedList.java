package com.prac.linkedList;

public class PartitionLinkedList {
    Node head;

    public static class Node{
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
        Node n6 = new Node(7);

        n1.next = n2;
        n1.next.next = n3;
        n1.next.next.next = n4;
        n1.next.next.next.next = n5;
        n1.next.next.next.next.next = n6;

        int val = 7;
        partitionWithValueMerged(n1, val);
        //partitionWithValue(n1, val)
    }
    public static void partitionWithValue(Node head, int val){
        Node left = new Node(-1);
        Node resLeft = left;
        Node right = new Node(-1);
        Node resRight = right;

        while(head!=null){
            if(head.data == val || head.data < val){
                Node n = new Node(head.data);
                left.next = n;
                left = left.next;
            }
            else{
                Node n = new Node(head.data);
                right.next = n;
                right = right.next;
            }
            head = head.next;
        }
        while (resLeft!=null && resLeft.next != null){
            resLeft = resLeft.next;
            System.out.println(resLeft.data);
        }
        System.out.println("------");
        while (resRight!=null && resRight.next != null){
            resRight = resRight.next;
            System.out.println(resRight.data);
        }
    }
    public static void partitionWithValueMerged(Node head, int val){
        Node left = head;
        Node leftEnd = left.next;
        //Node right = null;
        Node print = left;

        while (head != null){
            if(head.data < val){
                Node n = new Node(head.data);
                left = n;
                left.next = leftEnd;
            }
            else{
                Node m = new Node(head.data);
                leftEnd = m;
                leftEnd.next = null;
            }
            head = head.next;
        }
        while (print != null){
            System.out.println(print.data);
            print = print.next;
        }
    }
}
