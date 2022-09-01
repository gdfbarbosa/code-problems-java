import io.gdfbarbosa.algorithms.ValidParenthesis;
import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesisTest {
    @Test()
    public void testSuccess() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        Assert.assertEquals(true, validParenthesis.isValid("(){}[]"));
    }

    @Test()
    public void testFailure() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        Assert.assertEquals(false, validParenthesis.isValid("([{}]()([)(()))"));
    }
}
