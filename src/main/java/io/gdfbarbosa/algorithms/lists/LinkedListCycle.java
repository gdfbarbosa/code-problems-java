package io.gdfbarbosa.algorithms.lists;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle/">LeetCode - 141. Linked List Cycle</a>
 * <a href="https://en.wikipedia.org/wiki/Cycle_detection#Floyd's_tortoise_and_hare">Wikipedia - Floyd's tortoise and hare</a>
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        // slow (tortoise) and fast (hare)
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}
