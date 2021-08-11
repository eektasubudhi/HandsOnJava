package com.prac.array;

import java.util.HashMap;
import java.util.*;

public class ValidParenthesisString {
    public static void main(String[] args) {
      //  String input = ")))h(a(g)y)ha((";
        //aba()dgh
        //()))h(ag()y)ha(()
        //(((((((())))))))
        String input = "a))())("; // make a valid string removing invalid parentheses
        System.out.println(input);
        String validStr = validateParenthesis(input);
        System.out.println(validStr);

    }
    public static String validateParenthesis(String input){
        StringBuilder strBuilder = new StringBuilder();
        List<Integer> indexes = new ArrayList<>();
        Stack<Character> indexStack = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '(' || input.charAt(i) == ')'){
                //  System.out.print(i);
                if(input.charAt(i) == '('){
                    indexStack.push(input.charAt(i));
                    indexes.add(i);
                }
                if(!indexStack.isEmpty() && input.charAt(i) == ')' && indexStack.peek() == '('){
                    indexStack.pop();
                    indexes.remove(indexes.size() - 1);
                }
                else if(input.charAt(i) == ')' && indexStack.isEmpty()){
                    indexes.add(i);
                }
            }
        }
       // System.out.println(indexes);
        if(indexes.size() == 0) return input;
        for(int j = 0; j < input.length(); j++){
            if(!indexes.contains(j)){
                strBuilder.append(input.charAt(j));
            }
        }

        return strBuilder.toString();
    }
}
