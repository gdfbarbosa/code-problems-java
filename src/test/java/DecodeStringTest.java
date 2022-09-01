import io.gdfbarbosa.algorithms.DecodeString;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecodeStringTest {
    @Test
    public void test1() {
        DecodeString decodeString = new DecodeString();
        assertEquals("aaaaaaaaabcasdadasdadasdasddasdabcasdadasdadasdasddasda", decodeString.decodeString("3[aaa]2[bcasdadasdadasdasddasda]"));
    }

    @Test
    public void test2() {
        DecodeString decodeString = new DecodeString();
        assertEquals("accaccacc", decodeString.decodeString("3[a2[c]]"));
    }

    @Test
    public void test3() {
        DecodeString decodeString = new DecodeString();
        assertEquals("abcabccdcdcdef", decodeString.decodeString("2[abc]3[cd]ef"));
    }
    @Test
    public void test4() {
        DecodeString decodeString = new DecodeString();
        assertEquals("abcdcdabcdcd", decodeString.decodeString("2[1[ab]2[cd]]"));
    }
}
