package org.example.stack;

public class _344_Reverse_String {
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
    
    public static void main(String[] args) {
        char[] a = { 'h','e','l','l','o' };
        reverseString(a);
    }
//    Example 1:
//    Input: s = ['h','e','l','l','o']
//    Output: ['o','l','l','e','h']
//    
//    Example 2:
//    Input: s = ['H','a','n','n','a','h']
//    Output: ['h','a','n','n','a','H']
}
