import org.junit.Assert;
import org.junit.Test;

public class BinarySearchArrayTest {
    @Test
    public void testNotFound() {
        int[] arr = {-1, 0, 3, 5, 9, 12, 15, 17, 20, 199};
        BinarySearchArray binarySearchArray = new BinarySearchArray();
        Assert.assertEquals(-1, binarySearchArray.search(arr, 2));
    }

    @Test
    public void testFound() {
        int[] arr = {-1, 0, 3, 5, 9, 12, 15, 17, 20, 199, 200, 201, 202, 204, 500, 1000, 1000, 1000};
        BinarySearchArray binarySearchArray = new BinarySearchArray();
        Assert.assertEquals(3, binarySearchArray.search(arr, 5));
    }

    @Test
    public void testLongArray() {
        int factor = 3;
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i*factor;
        }
        BinarySearchArray binarySearchArray = new BinarySearchArray();
        Assert.assertEquals(45, binarySearchArray.search(nums, 135));
    }
}
