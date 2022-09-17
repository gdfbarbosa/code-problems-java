package io.gdfbarbosa.algorithms.lists;

import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {
    @Test
    public void test1() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);

        ListNode expected = new ListNode(3);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(1);
        Assert.assertEquals(expected, reverseLinkedList.reverseList(root));
    }
}
