package com.prac.stackQueue;

public class StackOfPlates {
    int top;
    int max = 10;
    int[] stk = new int[max];

    public StackOfPlates(){
        top = -1;
    }
    public void push(int a){
        if(top > max-1) System.out.println("stack full already!!");
        else{
            stk[++top] = a;
            System.out.println("added to stack");
        }
    }
    public int pop(){
        int a=0;
        if(top < 0) System.out.println("stack is empty!!");
        else {
            a = stk[top--];
            System.out.println("element popped is: "+a);
        }
        return a;
    }
    public int peek(){
        int a = 0;
        if(top < 0) System.out.println("Stack is empty!!");
        else a = stk[top];
        return a;
    }

    public static void main(String[] args) {
        StackOfPlates sp = new StackOfPlates();
        sp.push(2);
        sp.push(6);
        sp.push(10);
        sp.push(14);

        setOfStack(sp);
    }
    public static StackOfPlates setOfStack(StackOfPlates sp){

        return sp;
    }
}
