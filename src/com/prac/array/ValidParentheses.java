package com.prac.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String input = "{{({})}[]}{[()]}"; //check if string has valid balanced parentheses
        boolean result2 = parenthesesIsValid2(input);
        String result3 = makeParenthesesValid(input);

        System.out.println(result2+" with space o(n)");
        System.out.println(result3+" after making it valid");
    }

    public static boolean parenthesesIsValid2(String input){
        Stack<Character> st = new Stack<>();
        for(int i=0; i< input.length();i++){
            if(input.charAt(i)=='{' || input.charAt(i)=='(' || input.charAt(i)=='[') st.push(input.charAt(i));
            else{
                if (!st.isEmpty() && input.charAt(i) == '}' && st.peek() == '{') st.pop();
                else if (!st.isEmpty() && input.charAt(i) == ')' && st.peek() == '(') st.pop();
                else if (!st.isEmpty() && input.charAt(i) == ']' && st.peek() == '[') st.pop();
                else return false;
            }
        }
        if (st.isEmpty()) return true;
        else return false;
    }
    public static String makeParenthesesValid(String input){
        
        return "";
    }

}
