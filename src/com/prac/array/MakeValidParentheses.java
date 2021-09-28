package com.prac.array;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MakeValidParentheses {
    public static void main(String[] args) {
        String s= "lee(t(c)o)de)"; // make the string valid with balanced parentheses else delete parentheses to make valid string
        MakeValidParentheses obj = new MakeValidParentheses();
        obj.minRemoveToMakeValid(s);
    }
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> setForRemove = new HashSet<>();
        StringBuilder sd = new StringBuilder();
        //(a(b(c)d)
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') stack.push(i);
            if(s.charAt(i) == ')'){
                if(stack.isEmpty()) setForRemove.add(i);
                else stack.pop();
            }
        }
        while(!stack.isEmpty()) {
            setForRemove.add(stack.pop());
        }
        for(int j = 0; j < s.length(); j++){
            if(!setForRemove.contains(j)) sd.append(s.charAt(j));
        }
        return sd.toString();
    }
}
