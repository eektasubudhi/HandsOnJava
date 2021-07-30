package com.prac.dynamicProgramming;

import java.util.ArrayList;

public class ParenthesesCombinations {
    public static void main(String[] args) {
        int n = 4;
        char[] str = new char[n*2];
        ArrayList<String> result = new ArrayList<>();
        validParentheses(result, n, n, str, 0);
        for (String s : result) System.out.println(s);
    }
    public static void validParentheses(ArrayList<String> result, int leftN, int rightN, char[] str, int index){
        if(leftN < 0 || rightN < 0 || rightN < leftN) return;
        if(leftN == 0 && rightN == 0) result.add(String.copyValueOf(str));
        else{
            str[index] = '(';
            validParentheses(result, leftN - 1, rightN, str, index + 1);

            str[index] = ')';
            validParentheses(result, leftN, rightN - 1, str, index + 1);
        }
    }
}
