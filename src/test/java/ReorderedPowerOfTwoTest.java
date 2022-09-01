import io.gdfbarbosa.algorithms.ReorderedPowerOfTwo;
import org.junit.Test;

public class ReorderedPowerOfTwoTest {
    @Test()
    public void test() {
        ReorderedPowerOfTwo reorderedPowerOfTwo = new ReorderedPowerOfTwo();
        for (int i = 0; i < 100; i++) {
            int powerOfTwo = reorderedPowerOfTwo.reorderedPowerOf2(i);
            System.out.println(String.format("%1$d => %2$d", i, powerOfTwo));
        }
    }
}
