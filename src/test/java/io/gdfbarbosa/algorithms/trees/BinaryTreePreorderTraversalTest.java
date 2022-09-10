package io.gdfbarbosa.algorithms.trees;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreePreorderTraversalTest {
    @Test
    public void test1() {
        BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        Assert.assertArrayEquals(new Integer[]{3, 1, 5}, binaryTreePreorderTraversal.preorderTraversal(root).toArray(new Integer[0]));
    }

    @Test
    public void test2() {
        BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Assert.assertArrayEquals(new Integer[]{1, 2, 4, 5, 3}, binaryTreePreorderTraversal.preorderTraversal(root).toArray(new Integer[0]));
    }
}
