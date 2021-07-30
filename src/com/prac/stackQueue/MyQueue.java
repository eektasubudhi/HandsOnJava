package com.prac.stackQueue;

import java.util.Stack;

public class MyQueue {
    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.enQueue(2);
        mq.enQueue(4);
        mq.deQueue();
        mq.enQueue(6);

    }
    public void enQueue(int i){
        st1.push(i);
    }
    public int deQueue(){
        if(st2.isEmpty()){
            while (!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.pop();
    }
}
