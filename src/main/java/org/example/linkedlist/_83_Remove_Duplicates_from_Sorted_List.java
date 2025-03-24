package org.example.linkedlist;

public class _83_Remove_Duplicates_from_Sorted_List {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head = deleteDuplicates(head);
    }

//    Example 1:
//    Input: head = [1,1,2]
//    Output: [1,2]
//
//    Example 2:
//    Input: head = [1,1,2,3,3]
//    Output: [1,2,3]
}
