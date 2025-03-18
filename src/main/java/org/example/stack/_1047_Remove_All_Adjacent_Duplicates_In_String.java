package org.example.stack;

import java.util.Stack;
import java.util.stream.Collectors;

public class _1047_Remove_All_Adjacent_Duplicates_In_String {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch: stack){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "abbaca";
        System.out.println(removeDuplicates(s1));
    }
//    Example 1:
//    Input: s = "abbaca"
//    Output: "ca"
//    Explanation:
//    For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
//
//    Example 2:
//    Input: s = "azxxzy"
//    Output: "ay"
}
