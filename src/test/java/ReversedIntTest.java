import io.gdfbarbosa.algorithms.ReverseInt;
import org.junit.Assert;
import org.junit.Test;

public class ReversedIntTest {
    @Test()
    public void testMinus121() {
        ReverseInt reverseInt = new ReverseInt();
        Assert.assertEquals(-321, reverseInt.reverse(-123));
    }
}
