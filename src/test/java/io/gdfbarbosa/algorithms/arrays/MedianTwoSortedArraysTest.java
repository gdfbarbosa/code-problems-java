package io.gdfbarbosa.algorithms.arrays;

import io.gdfbarbosa.algorithms.dp.MedianTwoSortedArrays;
import org.junit.Assert;
import org.junit.Test;

public class MedianTwoSortedArraysTest {
    @Test()
    public void median1() {
        int[] B = new int[]{4,5,6};
        int[] A = new int[]{1,2,3};
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        Assert.assertEquals(3.5, medianTwoSortedArrays.findMedianSortedArraysBinarySearch(A, B), 0.0);
    }

    @Test()
    public void median2() {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        Assert.assertEquals(2.5, medianTwoSortedArrays.findMedianSortedArraysBinarySearch(nums1, nums2), 0.0);
    }

    @Test()
    public void median3() {
        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{4,5};
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        Assert.assertEquals(3.0, medianTwoSortedArrays.findMedianSortedArraysBinarySearch(nums1, nums2), 0.0);
    }
}
