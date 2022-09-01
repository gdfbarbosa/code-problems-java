import io.gdfbarbosa.algorithms.NumberOfIslands;
import org.junit.Assert;
import org.junit.Test;

public class NumberOfIslandsTest {
    @Test
    public void test() {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '1', '0'},
                {'0', '0', '0', '1', '1'}
        };
        Assert.assertEquals(2, numberOfIslands.numIslands(grid));
    }
}
