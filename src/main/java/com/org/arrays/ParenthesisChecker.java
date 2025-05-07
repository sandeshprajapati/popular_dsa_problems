package com.org.arrays;

import java.util.Stack;

public class ParenthesisChecker {
    //Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']', verify the validity of the arrangement.
    //An input string is valid if:
    //
    //         1. Open brackets must be closed by the same type of brackets.
    //         2. Open brackets must be closed in the correct order.
    //
    //Examples :
    //
    //Input: s = "[{()}]"
    //Output: true
    //Explanation: All the brackets are well-formed.
    //
    //Input: s = "[()()]{}"
    //Output: true
    //Explanation: All the brackets are well-formed.
    public static void main(String[] args) {
        String s = "[()()]{}";
        s = "[{()}]";
        System.out.println(isBalanced(s));

    }

    static boolean isBalanced(String s) {
        // code here
        final char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ']' && top != '[' || c == '}' && top != '{' || c == ')' && top != '(') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
