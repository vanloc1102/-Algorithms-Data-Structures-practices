package org.example.linkedlist;

public class _206_Reverse_Linked_List {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head = reverseList(head);

    }

//    Example 1:
//    Input: head = [1,2,3,4,5]
//    Output: [5,4,3,2,1]
//
//    Example 2:
//    Input: head = [1,2]
//    Output: [2,1]
}
