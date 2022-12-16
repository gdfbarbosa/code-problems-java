package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreePathSumTest {

    @Test
    public void hasPathSum() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        assertTrue(new BinaryTreePathSum().hasPathSum(root, 22));
    }
}