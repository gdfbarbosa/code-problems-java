import io.gdfbarbosa.algorithms.MinSetSize;
import org.junit.Assert;
import org.junit.Test;

public class MinSetSizeTest {
    @Test()
    public void test() {
        MinSetSize minSetSize = new MinSetSize();
        Assert.assertEquals(2, minSetSize.minSetSize(new int[]{3,3,3,3,5,5,5,2,2,7}));
    }
}
