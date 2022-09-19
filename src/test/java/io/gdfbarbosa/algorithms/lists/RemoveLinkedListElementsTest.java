package io.gdfbarbosa.algorithms.lists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveLinkedListElementsTest {
    @Test
    public void removeElements() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(6);
        root.next.next.next = new ListNode(3);
        root.next.next.next.next = new ListNode(4);
        root.next.next.next.next.next = new ListNode(5);
        root.next.next.next.next.next.next = new ListNode(6);
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        ListNode actual = removeLinkedListElements.removeElements(root, 6);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5);
        assertEquals(expected, actual);
    }
}