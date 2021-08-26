package com.prac.mediumPract;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String input = "))()(()()"; // o/p - 4
        // input -> "()(()" o/p -> 2
        LongestValidParentheses obj = new LongestValidParentheses();
        int result = obj.findTheLongestValidSubstring(input);
        System.out.println(result + " : length of longest substring with valid parentheses");
    }
    public int findTheLongestValidSubstring(String input){
        int maxCount = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '(') st.push(i);
            else{
                st.pop();
                if(st.isEmpty()) st.push(i);
                else maxCount = Math.max(maxCount, i - st.peek());
            }
        }
        return maxCount;
    }
}
