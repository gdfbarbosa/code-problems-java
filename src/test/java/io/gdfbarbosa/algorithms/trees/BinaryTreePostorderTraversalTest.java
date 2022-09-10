package io.gdfbarbosa.algorithms.trees;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreePostorderTraversalTest {
    @Test
    public void test1() {
        TreeNode root = new TreeNode(5);
        root.left =  new TreeNode(2);
        root.right =  new TreeNode(7);

        BinaryTreePostorderTraversal binaryTreePostorderTraversal = new BinaryTreePostorderTraversal();
        Assert.assertArrayEquals(new Integer[]{2, 7, 5}, binaryTreePostorderTraversal.postorderTraversal(root).toArray(new Integer[1]));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        root.left =  new TreeNode(2);
        root.right =  new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTreePostorderTraversal binaryTreePostorderTraversal = new BinaryTreePostorderTraversal();
        Assert.assertArrayEquals(new Integer[]{4, 5, 2, 3, 1}, binaryTreePostorderTraversal.postorderTraversal(root).toArray(new Integer[1]));
    }
}
