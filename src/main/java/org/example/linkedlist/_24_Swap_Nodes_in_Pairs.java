package org.example.linkedlist;

public class _24_Swap_Nodes_in_Pairs {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    static class Solution {
        public static ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(0, head);
            ListNode prev = dummy, cur = head;

            while (cur != null && cur.next != null) {
                ListNode npn = cur.next.next; //3,4
                ListNode second = cur.next; //2,3,4

                second.next = cur; // 1,2,3,4
                cur.next = npn; // 3,4
                prev.next = second; //

                prev = cur;
                cur = npn;
            }
            return dummy.next;
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);

            head = swapPairs(head);
        }
    }
//    Example 1:
//    Input: head = [1,2,3,4]
//    Output: [2,1,4,3]
//
//
//    Example 2:
//    Input: head = []
//    Output: []
//
//    Example 3:
//    Input: head = [1]
//    Output: [1]
//
//    Example 4:
//    Input: head = [1,2,3]
//    Output: [2,1,3]
}
