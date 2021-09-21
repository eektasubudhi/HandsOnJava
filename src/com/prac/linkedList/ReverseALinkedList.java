package com.prac.linkedList;

import java.util.Stack;

public class ReverseALinkedList {
    public static class Node{
      Node next;
      int val;

      Node(){}
      Node(int v){
          this.val = v;
      }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(5);
        Node n3 = new Node(10);
        Node n4 = new Node(15);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        //Node res = reverseLinkedListWithPointer(n1);
        //Node res = reverseWithRecursion(n1);
        Node res = reverseWithStack(n1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
    public static Node reverseLinkedListWithPointer(Node hd){
        //Node ans = new Node(-1);//1 -> 2 -> 3 -> 6 -> 9
        Node prev = null;
        Node curr = hd;
        Node next = null;
        while(curr != null){
            next = curr.next; //2
            curr.next = prev; //null
            prev = curr; //1
            curr = next; //2

        }
        hd = prev;
        return hd;
    }
    public static Node reverseWithRecursion(Node hd){
        if(hd == null || hd.next == null) return hd;
        Node res = reverseWithRecursion(hd.next);
        hd.next.next = hd;
        hd.next = null;
        return res;
    }
    public static Node reverseWithStack(Node hd){
        Stack<Node> st = new Stack<>();
        Node res = new Node();
        while (hd.next != null){
            st.push(hd);
            hd = hd.next;
        }
        res = hd;
        while (!st.isEmpty()){
            res.next = st.pop();
            res = res.next;
        }
        return hd;
    }
}
