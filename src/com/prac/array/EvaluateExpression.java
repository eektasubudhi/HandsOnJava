package com.prac.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        /* Given a string s which represents an expression, evaluate this expression and return its value.
        Input: s = " 3+5 / 2 "
        Output: 5
        Input: s = "3+2*2"
        Output: 7
         s = "333+11-5*2+800/4-1*7/3"
        */
        String calculateStr = "3+ 2*2 0/ 2";
        int result = calculate(calculateStr);
        System.out.println(result);
    }
    static int calculate(String calcString) {
        int sum = 0;
        Stack<Integer> st = new Stack<>();
        StringBuilder sd = new StringBuilder();
        char currentOperator = '+';
        for(int i = 0; i < calcString.length(); i++){
            if(Character.isDigit(calcString.charAt(i))){
                sd.append(calcString.charAt(i));
            }
            if(calcString.charAt(i)!=' ' && !Character.isDigit(calcString.charAt(i)) || i == calcString.length()-1){
                if(currentOperator == '/'){
                    st.push(st.pop() / Integer.valueOf(sd.toString()));
                    sd = new StringBuilder();
                }
                else if(currentOperator == '*'){
                    st.push(st.pop() * Integer.valueOf(sd.toString()));
                    sd = new StringBuilder();
                }
                else if(currentOperator == '+'){
                    st.push(Integer.valueOf(sd.toString()));
                    sd = new StringBuilder();
                }
                else if(currentOperator == '-'){
                    st.push(- Integer.valueOf(sd.toString()));
                    sd = new StringBuilder();
                }

                currentOperator = calcString.charAt(i);
            }
        }
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}
