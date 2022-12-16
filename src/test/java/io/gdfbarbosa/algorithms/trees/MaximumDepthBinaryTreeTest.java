package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthBinaryTreeTest {
    @Test
    public void maxDepthTest1() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        assertEquals(3, new MaximumDepthBinaryTree().maxDepth(treeNode));
    }

    @Test
    public void maxDepthTest2() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        assertEquals(2, new MaximumDepthBinaryTree().maxDepth(treeNode));
    }
}