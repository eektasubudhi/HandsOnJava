package com.prac.linkedList;

public class SumOfLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(6);
        Node n2 = new Node(2);
        Node n3 = new Node(1);
        Node n4 = new Node(2);
        Node n5 = new Node(9);
        Node n6 = new Node(5);

        SumOfLinkedList  h1 = new SumOfLinkedList();
        SumOfLinkedList  h2 = new SumOfLinkedList();
        h1.head = n1;
        n1.next = n2;
        n2.next = n3;

        h2.head = n4;
        n4.next = n5;
        n5.next = n6;

        //Node res = sumTheList(n1,n4);
        Node res = SumTheListOptimized(n1,n4);
        System.out.println("---------------------------------");
        while (res!=null){
            System.out.println(res.data);
            res=res.next;
        }

    }
    public static Node sumTheList(Node head1, Node head2){
        int count = 1;
        int sumHead1 = 0;
        int sumHead2 = 0;
        int resSum = 0;

        while(head1 != null){
            sumHead1 = sumHead1 + head1.data * count;
            count = count * 10;
            head1 = head1.next;
        }
        System.out.println(sumHead1 + " : sum head1");
        count = 1;
        while(head2 != null){
            sumHead2 = sumHead2 + head2.data * count;
            count = count * 10;
            head2 = head2.next;
        }
        System.out.println(sumHead2 + " : sum head2");

        resSum = sumHead1 + sumHead2;
        System.out.println(resSum+" : final sum");

        Node res = new Node(Integer.MIN_VALUE);
        Node head = res;

        while (resSum>0){
            int dig = resSum % 10;
            resSum = resSum / 10;
            Node newN = new Node(dig);
            res.next = newN;
            res = res.next;
        }
        return head.next;
    }
    public static Node SumTheListOptimized(Node head1, Node head2){
        Node res = new Node(-1);
        Node head = res;
        int carry = 0;
        while (head1 != null && head2 != null){
            int newVal = 0;
            int sum = 0;
            sum = head1.data + head2.data + carry;
            if(sum > 9){
                newVal = sum % 10;
                carry = sum / 10;
            } else {
                newVal = sum;
                carry = 0;
            }
            head1 = head1.next;
            head2 = head2.next;
            Node n = new Node(newVal);
            res.next = n;
            res = res.next;
        }

        return head.next                                                         ;
    }
}
