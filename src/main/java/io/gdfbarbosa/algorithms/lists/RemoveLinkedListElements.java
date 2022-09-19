package io.gdfbarbosa.algorithms.lists;

/**
 * <a href="https://leetcode.com/problems/remove-linked-list-elements/">203. Remove Linked List Elements</a>
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head, previous = dummy;
        while (cur != null) {
            if (cur.val == val) {
                previous.next = cur.next;
            } else {
                // move previous cursor
                previous = previous.next;
            }
            // move current cursor
            cur = cur.next;
        }
        return dummy.next;
    }
}
