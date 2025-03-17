package org.example.stack;

import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (isCouple(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isCouple(char inStack, char current) {
        return inStack == '(' && current == ')'
                || inStack == '{' && current == '}'
                || inStack == '[' && current == ']';
    }

    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));
    }
//    Example 1:
//    Input: s = "()"
//    Output: true

//    Example 2:
//    Input: s = "()[]{}"
//    Output: true
//
//    Example 3:
//    Input: s = "(]"
//    Output: false
//
//    Example 4:
//    Input: s = "([])"
//    Output: true
}
