package com.prac.stackQueue;

public class StackMin {
    int top;
    int max = 10;
    int[] stk = new int[max];
    int prevMin = 0;
    int min = 0;

    public StackMin(){
        top = -1;
    }
    public void push(int a){
        if(top > max-1) System.out.println("stack full already!!");
        else{
            if(stk[0] == 0) min = a;
            stk[++top] = a;
            if(a < min) {
                prevMin = min;
                min = a;
            }
            System.out.println("added to stack");
        }
    }
    public int pop(){
        int a=0;
        if(top < 0) System.out.println("stack is empty!!");
        else {
            a = stk[top--];
            if(a == min) {
                min = prevMin;
            }
            System.out.println("element popped is: "+a+" prev min: " +prevMin);
        }
        return a;
    }
    public int peek(){
        int a = 0;
        if(top < 0) System.out.println("Stack is empty!!");
        else a = stk[top];
        return a;
    }
    public int min(){
        int a = 0;
        if(top < 0) System.out.println("Stack is empty!!");
        else{
            System.out.println(min+" : min");
        }
        return a;
    }

    public static void main(String[] args) {
        StackMin st = new StackMin();
        st.push(6);
        st.min();
        st.push(5);
        st.min();
        st.push(2);
        st.min();
        st.push(1);
        st.min();
        st.pop();
        st.min();
        st.pop();
        st.min();

    }

}
