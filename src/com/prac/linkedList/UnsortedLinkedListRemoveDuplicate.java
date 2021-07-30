package com.prac.linkedList;

import java.util.HashSet;

public class UnsortedLinkedListRemoveDuplicate {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next= null;
        }
    }

    public static void main(String[] args) {
        UnsortedLinkedListRemoveDuplicate llist = new UnsortedLinkedListRemoveDuplicate();
        Node n1 = new Node(6);
        Node n2 = new Node(3);
        Node n3 = new Node(7);
        Node n4 = new Node(8);
        Node n5 = new Node(6);
        Node n6 = new Node(3);

        llist.head = n1;
        head.next = n2;
        head.next.next = n3;
        head.next.next.next = n4;
        head.next.next.next.next = n5;
        head.next.next.next.next.next = n6;

        System.out.println("-------------");
        //removeDuplicates(head);
        removeDuplicates1(head);
        while(head!=null){
            System.out.println(head.data+" ");
            head = head.next;
        }

    }
    static void removeDuplicates1(Node head){
        Node pnt1 = head;
        Node pnt2 = null;
        while (pnt1 != null && pnt1.next != null){
            pnt2 = pnt1;
            while(pnt2.next != null){
                if(pnt1.data == pnt2.next.data){
                    pnt2.next = pnt2.next.next;
                }
                else pnt2 = pnt2.next;
            }
            pnt1 = pnt1.next;
        }
    }
    static void removeDuplicates(Node head){
        if(head == null) System.out.println("OMG Null here. what the hell!");
        HashSet<Integer> hs = new HashSet<>();
        Node result = null;

        while(head!=null){
            if(hs.contains(head.data)){
                result.next = head.next;
            }
            else{
                hs.add(head.data);
                result = head;
            }
            head = head.next;
        }

       /* while(result!=null){
            System.out.println(result.data+" ");
            result = result.next;
        }*/
    }
}
