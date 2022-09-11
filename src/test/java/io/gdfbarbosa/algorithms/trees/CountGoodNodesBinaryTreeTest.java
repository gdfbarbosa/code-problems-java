package io.gdfbarbosa.algorithms.trees;

import org.junit.Assert;
import org.junit.Test;

public class CountGoodNodesBinaryTreeTest {
    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);
        CountGoodNodesBinaryTree countGoodNodesBinaryTree = new CountGoodNodesBinaryTree();
        Assert.assertEquals(4, countGoodNodesBinaryTree.goodNodes(root));
    }
}
