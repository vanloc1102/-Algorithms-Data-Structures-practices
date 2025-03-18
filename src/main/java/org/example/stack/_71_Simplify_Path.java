package org.example.stack;

import java.util.Stack;

public class _71_Simplify_Path {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            }
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        return "/" + String.join("/", stack);
    }
    public static void main(String[] args) {
        String simplifyPath = simplifyPath("/home/");
        System.out.println(simplifyPath);
    }

//    Example 1:
//    Input: path = "/home/"
//    Output: "/home"
//    Explanation:
//    The trailing slash should be removed.
//
//    Example 2:
//    Input: path = "/home//foo/"
//    Output: "/home/foo"
//    Explanation:
//    Multiple consecutive slashes are replaced by a single one.
//
//    Example 3:
//    Input: path = "/home/user/Documents/../Pictures"
//    Output: "/home/user/Pictures"
//    Explanation:
//    A double period ".." refers to the directory up a level (the parent directory).
//
//    Example 4:
//    Input: path = "/../"
//    Output: "/"
//    Explanation:
//    Going one level up from the root directory is not possible.
//
//        Example 5:
//    Input: path = "/.../a/../b/c/../d/./"
//    Output: "/.../b/d"
//    Explanation:
//            "..." is a valid name for a directory in this problem.
}
