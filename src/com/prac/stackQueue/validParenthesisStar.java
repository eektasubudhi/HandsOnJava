package com.prac.stackQueue;

import java.util.Stack;
/*
Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

Input: s = "(*))"
Output: true
 */
public class validParenthesisStar {
    public static void main(String[] args) {
        validParenthesisStar obj = new validParenthesisStar();
        boolean res1 = obj.checkValidString("(((())*");
        System.out.println("Answer with stack : " +res1);

        boolean res2 = obj.checkValidStringGreedy("(((())*");
        System.out.println("Answer with greedy : " + res2);
    }
    //way-1
    public boolean checkValidString(String s) {
        Stack<Integer> braces = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*') star.push(i);
            else if(s.charAt(i)  == '(') braces.push(i);
            else {
                if(!braces.isEmpty()) braces.pop();
                else if(!star.isEmpty()) star.pop();
                else return false;
            }

        }
        while(!braces.isEmpty()){
            if(star.isEmpty()) return false;
            else if (braces.peek() < star.peek()){
                braces.pop();
                star.pop();
            }
            else return false;
        }
        return true;
    }
    //way-2
    public boolean checkValidStringGreedy(String s) {
        int min = 0;
        int max = 0;
        for(char c : s.toCharArray()){
            min += c == '(' ? 1 : -1;
            min = Math.max(min, 0);

            max += c == ')' ? -1 : 1;
            if(max < 0) return false;
        }
        return min == 0;
    }
}
