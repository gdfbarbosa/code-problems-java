import io.gdfbarbosa.algorithms.ArraySumK;
import org.junit.Assert;
import org.junit.Test;

public class ArraySumKTest {
    @Test()
    public void testSum() {
        ArraySumK arraySumK = new ArraySumK();
        int totalSubarrays = arraySumK.subarraySum(new int[]{1, 2, 1, 2}, 3);
        Assert.assertEquals(3, totalSubarrays);
    }
    @Test()
    public void testSum2() {
        ArraySumK arraySumK = new ArraySumK();
        int totalSubarrays = arraySumK.subarraySum(new int[]{3,4,7,2,-3,1,4,2}, 7);
        Assert.assertEquals(4, totalSubarrays);
    }
}