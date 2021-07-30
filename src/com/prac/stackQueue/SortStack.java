package com.prac.stackQueue;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(20);
        st.push(4);
        st.push(6);
        st.push(80);
        st.push(11);

        sortStack(st);

    }
    public static void sortStack(Stack<Integer> st){
        Stack<Integer> newSt = new Stack();
        while(!st.isEmpty()){
            int popped = st.pop();

            while(!newSt.isEmpty() && newSt.peek() < popped){
                st.push(newSt.pop());
            }
            newSt.push(popped);
        }
        while (!newSt.isEmpty()){
            System.out.println(newSt.pop());
        }

    }
}
