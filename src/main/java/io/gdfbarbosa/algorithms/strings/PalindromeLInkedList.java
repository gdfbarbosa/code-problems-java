package io.gdfbarbosa.algorithms.strings;

public class PalindromeLInkedList {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
//        if (fast != null) { // odd
//            fast = fast.next;
//        }
        ListNode reverse = reverse(slow);
        fast = head;
        while (reverse != null) {
            if (fast.val != reverse.val) {
                return false;
            }
            reverse = reverse.next;
            fast = fast.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            // change order, point to previous node
            head.next = prev;
            // keep previous node
            prev = head;
            // move pointer
            head = next;
        }
        return prev;
    }
}
