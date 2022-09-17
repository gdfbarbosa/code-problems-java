package io.gdfbarbosa.algorithms.lists;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfLinkedListTest {

    @Test
    public void middleNode() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(3);
        expected.next = new ListNode(4);
        expected.next.next = new ListNode(5);

        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        assertEquals(expected, middleOfLinkedList.middleNode(root));
    }
}