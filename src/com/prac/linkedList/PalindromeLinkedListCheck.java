package com.prac.linkedList;

import java.util.Stack;

public class PalindromeLinkedListCheck {
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
        Node n2 = new Node(2);
        Node n3 = new Node(1);
        Node n4 = new Node(2);
        Node n5 = new Node(6);

        n1.next = n2;
        n1.next.next = n3;
        n1.next.next.next = n4;
        n1.next.next.next.next = n5;

        /*  while (fstPtr!=null){
            System.out.println(fstPtr.data+" kk");
            fstPtr=fstPtr.next;
        }*/
        boolean result = isPalindrome(n1);
        System.out.println(result+ " : Result");
        //findMidNode(n1);
    }


    public static void findMidNode(Node head){
        Node fstPtr = head;
        Node slwPtr = head;
        while(slwPtr != null && fstPtr != null && fstPtr.next != null){
            fstPtr = fstPtr.next.next;
            slwPtr = slwPtr.next;
        }
    }

    public static boolean isPalindrome(Node head){
        Node fstPtr = head;
        Node slwPtr = head;
        Stack<Integer> st = new Stack<>();
        while(fstPtr != null && fstPtr.next != null){
            st.push(slwPtr.data);
            fstPtr = fstPtr.next.next;
            slwPtr = slwPtr.next;
        }
        if(fstPtr != null) slwPtr = slwPtr.next;
        while(slwPtr != null){
            if(st.pop() != slwPtr.data) return false;
            slwPtr = slwPtr.next;
        }
        if(st.isEmpty()) return true;
        else return false;
    }
}
