package com.prac.linkedList;

public class DeleteAlternateNode {
   // static Node head;
    public static class Node{
        int data;
        Node next;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);
        Node nodeF = new Node(6);

        //head = nodeA;
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;

        //deleteAlternate(head);
        deleteAlternate(nodeA);
       // deleteElement(nodeA);
        /*while(head != null){
            System.out.println(head.data);
            head = head.next;
        }*/
    }
   /* public static Node deleteAlternate(Node head){
        Node prev = new Node(-1);
        int count = 1;
        while(head != null && prev != null) {
            if (count % 2 == 0) {
                System.out.println(prev.data+" prev even");
                System.out.println(head.data+" head even");
                prev.next = head.next;
            } else {
                System.out.println(prev.data+" prev odd");
                System.out.println(head.data+" head odd");
                prev.next = head;
                //head = head.next;
            }
            head = head.next;
            prev = prev.next;
            count++;
        }
        return prev;
    }*/
    /*public static void deleteAlternate(Node head){
        Node curr = head;
        while (curr != null && curr.next != null){
            //System.out.println(curr.data);
            curr.next = curr.next.next;
            curr = curr.next;
        }
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }

    }*/
   public static void deleteAlternate(Node head){
       Node curr = new Node(-1);
       curr.next = head;
       Node hd = head;

       while (hd != null && hd.next != null){
           //System.out.println(curr.data);
           hd.next = hd.next.next;
           hd = hd.next;
       }
       Node res = curr.next;
       while(res != null){
           System.out.println(res.data);
           res = res.next;
       }

   }

}
