package com.prac.linkedList;

public class DeleteElementLinkedList {
    //static Node head;
    static class Node{
        int data;
        Node next;

        public Node(int d){
            data=d;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);

        //head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node head =  deleteElement(n1,5);
        //remove(5);
        while (head != null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    /*public static Node deleteElement(Node curr, int m){
        Node h = curr;
        Node res = null;
        while (curr != null){
            if(curr.data == m){
                res.next = curr.next;
            }
            else res = curr;
            curr = curr.next;
        }
        return h;
    }*/
    //Looi's experiment
    public static Node deleteElement(Node curr, int m){
        Node h = new Node(-1);
        h.next = curr;
        Node res = h, hd = curr;

        while (hd != null){
            if(hd.data == m){
                res.next = hd.next;
            }
            else res = hd;
            hd = hd.next;
        }
        return h.next;
    }


    /*public static void remove(int key)
    {
        if(head == null) throw new RuntimeException("cannot delete");

        if( head.data == (key) )
        {
            head = head.next;
            return;
        }

        Node cur  = head;
        Node prev = null;

        while(cur != null && cur.data != (key) )
        {
            prev = cur;
            cur = cur.next;
        }

        if(cur == null) throw new RuntimeException("cannot delete");

        //delete cur node
        prev.next = cur.next;
    }*/
}
