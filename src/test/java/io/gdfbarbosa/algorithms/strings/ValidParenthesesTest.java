package io.gdfbarbosa.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {
    @Test()
    public void testSuccess() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertTrue(validParentheses.isValid("(){}[]"));
    }

    @Test()
    public void testFailure() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertFalse(validParentheses.isValid("([{}]()([)(()))"));
    }
}
