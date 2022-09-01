import io.gdfbarbosa.algorithms.Base2conversion;
import org.junit.Assert;
import org.junit.Test;

public class Base2ConversionTest {
    @Test()
    public void test23() {
        Base2conversion base2conversion = new Base2conversion();
        Assert.assertEquals("10111", base2conversion.convertToBase2(23));
    }
}
