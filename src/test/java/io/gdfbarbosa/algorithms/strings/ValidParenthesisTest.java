package io.gdfbarbosa.algorithms.strings;

import io.gdfbarbosa.algorithms.strings.ValidParenthesis;
import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesisTest {
    @Test()
    public void testSuccess() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        Assert.assertTrue(validParenthesis.isValid("(){}[]"));
    }

    @Test()
    public void testFailure() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        Assert.assertFalse(validParenthesis.isValid("([{}]()([)(()))"));
    }
}
