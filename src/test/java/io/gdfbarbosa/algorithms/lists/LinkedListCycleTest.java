package io.gdfbarbosa.algorithms.lists;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LinkedListCycleTest {
    @Test
    public void hasCycle() {
        ListNode first = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        first.next = secondNode;
        ListNode thirdNode = new ListNode(0);
        secondNode.next = thirdNode;
        ListNode fourthNode = new ListNode(-4);
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        assertTrue(linkedListCycle.hasCycle(first));
    }
}