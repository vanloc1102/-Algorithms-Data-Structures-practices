package org.example.stack;

import java.util.Stack;

public class _1544_Make_The_String_Great {
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && (stack.peek() == c + 32 || stack.peek() == c - 32)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String leEeetcode = "leEeetcode";
        System.out.println(makeGood(leEeetcode));
    }

//    Example 1:
//    Input: s = "leEeetcode"
//    Output: "leetcode"
//    Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
//
//    Example 2:
//    Input: s = "abBAcC"
//    Output: ""
//    Explanation: We have many possible scenarios, and all lead to the same answer. For example:
//            "abBAcC" --> "aAcC" --> "cC" --> ""
//            "abBAcC" --> "abBA" --> "aA" --> ""
//
//    Example 3:
//    Input: s = "s"
//    Output: "s"
}
