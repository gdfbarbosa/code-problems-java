package io.gdfbarbosa.algorithms.lists;

/**
 * <a href="https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked List</a>
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            // keep next node in variable
            ListNode next = head.next;
            // change order, point next to previous node
            head.next = prev;
            // update previous node
            prev = head;
            // move pointer o the next
            head = next;
        }
        return prev;
    }
}
