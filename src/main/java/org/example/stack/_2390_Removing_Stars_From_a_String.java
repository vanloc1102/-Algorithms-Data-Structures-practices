package org.example.stack;

import java.util.Stack;

public class _2390_Removing_Stars_From_a_String {
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && !stack.empty()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character c : stack) {
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s1 = "erase*****";
        System.out.println(removeStars(s1));
    }

//    Example 1:
//    Input: s = "leet**cod*e"
//    Output: "lecoe"
//    Explanation: Performing the removals from left to right:
//            - The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
//            - The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
//            - The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
//    There are no more stars, so we return "lecoe".
//
//    Example 2:
//    Input: s = "erase*****"
//    Output: ""
//    Explanation: The entire string is removed, so we return an empty string.
}
