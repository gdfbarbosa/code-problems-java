package io.gdfbarbosa.algorithms.lists;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/">876. Middle of the Linked List</a>
 */
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = null;
        // edge case
        if (fast == null || fast.next == null) {
            return fast;
        }
        // normal cases
        while (fast != null && fast.next != null) {
            // move two pointers
            fast = fast.next.next;
            // move one pointer
            slow = head = head.next;
        }
        return slow;
    }
}
