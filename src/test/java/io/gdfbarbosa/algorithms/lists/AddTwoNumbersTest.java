package io.gdfbarbosa.algorithms.lists;

import io.gdfbarbosa.algorithms.lists.AddTwoNumbers;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {
    @Test()
    public void simpleTest() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode number1 = getNumber("243" );
        AddTwoNumbers.ListNode number2 = getNumber("127" );
        AddTwoNumbers.ListNode listNode = addTwoNumbers.addTwoNumbers(number1, number2);
        Assert.assertEquals("3601", listNode.toString());
    }

    public AddTwoNumbers.ListNode getNumber(String number) {
        AddTwoNumbers.ListNode start1 = new AddTwoNumbers.ListNode(-1);
        AddTwoNumbers.ListNode l1 = start1;
        for (int i = 0; i < number.length(); i++) {
            l1.setNext(new AddTwoNumbers.ListNode(Integer.parseInt(number.charAt(i)+"")));
            l1 = l1.getNext();
        }
        return start1.getNext();
    }
}
