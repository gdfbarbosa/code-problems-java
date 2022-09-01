import io.gdfbarbosa.algorithms.PalindromeLInkedList;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeLinkedListTest {
    @Test()
    public void testEven() {
        PalindromeLInkedList.ListNode node = createNode(new int[]{1, 2, 3, 3, 2, 1});
        PalindromeLInkedList palindromeLInkedList = new PalindromeLInkedList();
        Assert.assertEquals(true, palindromeLInkedList.isPalindrome(node));
    }

    @Test()
    public void testOdd() {
        PalindromeLInkedList.ListNode node = createNode(new int[]{1, 2, 3, 4, 3, 2, 1});
        PalindromeLInkedList palindromeLInkedList = new PalindromeLInkedList();
        Assert.assertEquals(true, palindromeLInkedList.isPalindrome(node));
    }

    @Test()
    public void reverseTest() {
        PalindromeLInkedList palindromeLInkedList = new PalindromeLInkedList();
        palindromeLInkedList.reverse(createNode(new int[]{1,2,3}));
    }

    public PalindromeLInkedList.ListNode createNode(int[] number) {
        PalindromeLInkedList.ListNode tail = new PalindromeLInkedList.ListNode(-1);
        PalindromeLInkedList.ListNode head = tail;
        for (int num : number) {
            head.next = new PalindromeLInkedList.ListNode(num);
            head = head.next;
        }
        return tail.next;
    }
}
