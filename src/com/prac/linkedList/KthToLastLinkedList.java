package com.prac.linkedList;

public class KthToLastLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);

        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node res = findKthToLast(head, 2);
        while (res != null){
            System.out.println(res.data);
            res = res.next;
        }
    }
    public static Node findKthToLast(Node head, int k){
        Node result = null;
        int count=0;
        while(head!=null){
            if(count == k) {
                result = head;
                break;
            }
            count++;
            head = head.next;
        }
        return result;
    }
}
