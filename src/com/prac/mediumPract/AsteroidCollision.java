package com.prac.mediumPract;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[]  asteroids = {10, -4, 2, -1};
        int[] result = finalAsteroidStatus(asteroids);
        for (int i : result) System.out.println(i);
    }
    public static int[] finalAsteroidStatus(int[] ast){
        Stack<Integer> st = new Stack<>();
        for(int i : ast) {
            while (!st.isEmpty() && i < 0 && 0 < st.peek()){
                if(-i > st.peek()) {
                    st.pop();
                    continue;
                }
                else if(-i == st.peek()) st.pop();
                break;
            }
            st.push(i);
        }
        int[] res = new int[st.size()];
        int counter = st.size() - 1;
        while (!st.isEmpty() && counter >= 0){
            res[counter--] = st.pop();
        }
        return res;
    }
}
