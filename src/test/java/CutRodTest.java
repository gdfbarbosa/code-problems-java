import io.gdfbarbosa.algorithms.CutRod;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CutRodTest {
    static Integer[] prices;
    static {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add((int) (java.lang.Math.random()*100));
        }
        prices = list.toArray(new Integer[0]);
    }

    static CutRod cutRod = new CutRod();

    @Test
    public void cutRod1() {
        Assert.assertEquals(1, cutRod.cutRod(prices, 1));
    }

    @Test
    public void cutRod2() {
        Assert.assertEquals(5, cutRod.cutRod(prices, 2));
    }

    @Test
    public void cutRod3() {
        Assert.assertEquals(8, cutRod.cutRod(prices, 3));
    }

    @Test
    public void cutRod4() {
        Assert.assertEquals(10, cutRod.cutRod(prices, 4));
    }

    @Test
    public void cutRod5() {
        Assert.assertEquals(13, cutRod.cutRod(prices, 5));
    }

    @Test
    public void cutRod6() {
        Assert.assertEquals(17, cutRod.cutRod(prices, 6));
    }

    @Test
    public void cutRod7() {
        Assert.assertEquals(18, cutRod.cutRod(prices, 7));
    }

    @Test
    public void cutRod8() {
        Assert.assertEquals(22, cutRod.cutRod(prices, 8));
    }

    @Test
    public void cutRod9() {
        Assert.assertEquals(25, cutRod.cutRod(prices, 9));
    }

    @Test
    public void cutRod10() {
        Assert.assertEquals(30, cutRod.cutRod(prices, 10));
    }

    @Test
    public void cutRod30() {
        Assert.assertEquals(103, cutRod.cutRod(prices, 35));
    }

    @Test
    public void cutRod100() {
        Assert.assertEquals(7500, cutRod.cutRod(prices, 100));
    }

    @Test
    public void cutRod1000() {
        Assert.assertEquals(7500, cutRod.cutRod(prices, 1000));
    }
}
