package com.prac.linkedList;

import java.util.LinkedList;
import java.util.Stack;

public class CheckIsLinkedListPalindrome {
        Node head;
        public static class Node{
            int data;
            Node next;

            public Node(int d){
                data =d;
                next =null;
            }
        }

    public static void main(String[] args) {

        Node nodeA = new Node(10);
        Node nodeB = new Node(11);
        Node nodeC = new Node(12);
        Node nodeD = new Node(11);
        Node nodeE = new Node(10);
        nodeA.next=nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;
        nodeD.next=nodeE;
        boolean n = isLinkedListPalindromeNaive(nodeA);
        System.out.println(n+" : Naive");
        boolean o = isLinkedListPalindromeOptimal(nodeA);
        System.out.println(o+" : Optimal");
    }
    public static boolean isLinkedListPalindromeNaive(Node headnode){
            /*
            [10|]->[11|]->[12|]->[11|]->[10|]
             */
        boolean isPalindrome=false;
        Stack<Integer> st = new Stack<>();
            Node slow = headnode;
            while(slow != null){
                st.push(slow.data);
                slow = slow.next;
            }
            while(headnode != null){
               int stData = st.pop();
               if(stData == headnode.data){
                   isPalindrome = true;
                   headnode = headnode.next;
               }
               else{
                   isPalindrome = false;
                   break;
               }
            }
           return isPalindrome;
    }
    public static boolean isLinkedListPalindromeOptimal(Node headnode){
            /*
            [1]->[4]->[2]->[2]->[4]->[1]
            [1]->[4]->[4]->[1]
             */
            Stack<Integer> st = new Stack<>();
            Node slow = headnode;
            Node fast = headnode;
            boolean ispali = false;
            while(slow != null && fast != null && fast.next != null){
                st.push(slow.data);
                fast = fast.next.next;
                slow = slow.next;
            }
            //System.out.println(slow.data+ " slowdata");
            while (!st.isEmpty() && slow != null){
                int s = st.pop();
                if(slow.next.data == s){
                    System.out.println(slow.next.data+" slow data in if");
                    System.out.println(s+" pop data in if");
                    ispali=true;
                }
                else{
                    System.out.println(slow.next.data+" slowdata in else");
                    System.out.println(s+" pop data in else");
                    ispali = false;
                    break;
                }
                slow = slow.next;
            }
            return ispali;
    }
}
