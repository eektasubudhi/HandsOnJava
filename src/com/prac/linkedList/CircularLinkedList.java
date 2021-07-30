package com.prac.linkedList;

public class CircularLinkedList {

    static class ListNode{
        int value;
        ListNode next;

        public ListNode(int value){
            this.value = value;
        }
    }
    public boolean checkCircularLinkedList(ListNode node1){
        ListNode fast = node1;
        ListNode slow = node1;

        while(fast != null && slow != null) {
            if (fast.next != null) {
                fast = fast.next.next;
                if (fast == slow) return true;
            }
            slow = slow.next;
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode ln1 = new ListNode(4);
        ListNode ln2 = new ListNode(3);
        ListNode ln3 = new ListNode(2);
        ListNode ln4 = new ListNode(1);
        ListNode ln5 = new ListNode(5);
        ListNode ln6 = new ListNode(6);
        ListNode ln7 = new ListNode(9);

        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln3.next.next = ln5;
        ln3.next.next.next = ln6;
        ln6.next = ln7;
        ln7.next = ln3;
        //ln3.value = 8;

        CircularLinkedList cl = new CircularLinkedList();
        boolean flg = cl.checkCircularLinkedList(ln1);
        System.out.println(flg);
    }

}
