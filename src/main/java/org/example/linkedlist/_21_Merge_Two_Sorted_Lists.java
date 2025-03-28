package org.example.linkedlist;

public class _21_Merge_Two_Sorted_Lists {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode head = new ListNode(-1);
            ListNode cur = head;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    cur.next = list1;
                    list1 = list1.next;
                } else {
                    cur.next = list2;
                    list2 = list2.next;
                }
                cur = cur.next;
            }
            cur.next = list1 == null ? list2 : list1;
            return head.next;
        }
    }

//    Example 1:
//    Input: list1 = [1,2,4], list2 = [1,3,4]
//    Output: [1,1,2,3,4,4]
//
//    Example 2:
//    Input: list1 = [], list2 = []
//    Output: []
//
//    Example 3:
//    Input: list1 = [], list2 = [0]
//    Output: [0]
}
