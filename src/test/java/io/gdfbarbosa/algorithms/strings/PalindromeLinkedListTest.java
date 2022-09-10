package io.gdfbarbosa.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeLinkedListTest {
    @Test()
    public void testEven() {
        PalindromeLinkedList.ListNode node = createNode(new int[]{1, 2, 3, 3, 2, 1});
        PalindromeLinkedList palindromeLInkedList = new PalindromeLinkedList();
        Assert.assertTrue(palindromeLInkedList.isPalindrome(node));
    }

    @Test()
    public void testOdd() {
        PalindromeLinkedList.ListNode node = createNode(new int[]{1, 2, 3, 4, 3, 2, 1});
        PalindromeLinkedList palindromeLInkedList = new PalindromeLinkedList();
        Assert.assertTrue(palindromeLInkedList.isPalindrome(node));
    }

    @Test()
    public void reverseTest() {
        PalindromeLinkedList palindromeLInkedList = new PalindromeLinkedList();
        palindromeLInkedList.reverse(createNode(new int[]{1,2,3}));
    }

    public PalindromeLinkedList.ListNode createNode(int[] number) {
        PalindromeLinkedList.ListNode tail = new PalindromeLinkedList.ListNode(-1);
        PalindromeLinkedList.ListNode head = tail;
        for (int num : number) {
            head.next = new PalindromeLinkedList.ListNode(num);
            head = head.next;
        }
        return tail.next;
    }
}
