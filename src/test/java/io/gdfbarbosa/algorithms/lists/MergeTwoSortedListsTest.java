package io.gdfbarbosa.algorithms.lists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedListsTest {
    @Test
    public void mergeTwoLists() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next = new ListNode(4);

        assertEquals(expected, mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }
}