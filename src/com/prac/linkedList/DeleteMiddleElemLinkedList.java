package com.prac.linkedList;

public class DeleteMiddleElemLinkedList {
    Node head;

    public static class Node{
        char data;
        Node next;

        Node(char d){
            data=d;
            next =null;
        }
    }

    public static void main(String[] args) {
        Node nodeA = new Node('A');
        Node nodeB = new Node('B');
        Node nodeC = new Node('C');
        Node nodeD = new Node('D');
        Node nodeE = new Node('E');

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        Node result = deleteMiddleOfLinkedList(nodeA);
        while (result != null){
            System.out.println(result.data);
            result = result.next;
        }
    }
    public static Node deleteMiddleOfLinkedList(Node headNode){
        Node slow = headNode;
        Node fast = headNode;
        Node prev = null;

        while(slow != null && fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(fast.data + " : ");
        prev.next = slow.next;
        return headNode;
    }
}
