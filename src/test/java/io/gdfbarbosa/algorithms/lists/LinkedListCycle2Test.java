package io.gdfbarbosa.algorithms.lists;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycle2Test {

    @Test
    public void detectCycle1() {
        ListNode first = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        first.next = secondNode;
        ListNode thirdNode = new ListNode(0);
        secondNode.next = thirdNode;
        ListNode fourthNode = new ListNode(-4);
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;
        LinkedListCycle2 linkedListCycle2 = new LinkedListCycle2();
        assertEquals(secondNode, linkedListCycle2.detectCycle(first));
    }

    @Test
    public void detectCycle2() {
        ListNode first = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        first.next = secondNode;
        secondNode.next = first;
        LinkedListCycle2 linkedListCycle2 = new LinkedListCycle2();
        assertEquals(first, linkedListCycle2.detectCycle(first));
    }
}