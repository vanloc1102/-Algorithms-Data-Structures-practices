package org.example.linkedlist;

import java.util.List;

public class _234_Palindrome_Linked_List {
    
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
     
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode secondHalf = reverseList(slow);
            ListNode firstHalf = head;

            while (secondHalf != null) {
                if (firstHalf.val != secondHalf.val) return false;
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
            return true;
        }

        private ListNode reverseList(ListNode head) {
            ListNode prev = null, current = head;
            while (current != null) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }
    }
//    Example 1:
//    Input: head = [1,2,2,1]
//    Output: true
//
//    Example 2:
//    Input: head = [1,2]
//    Output: false
}
