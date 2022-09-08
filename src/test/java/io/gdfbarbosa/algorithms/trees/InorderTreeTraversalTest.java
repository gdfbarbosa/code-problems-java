package io.gdfbarbosa.algorithms.trees;

import org.junit.Assert;
import org.junit.Test;

public class InorderTreeTraversalTest {
    @Test
    public void test1() {
        TreeNode root = new TreeNode(5);
        root.left =  new TreeNode(2);
        root.right =  new TreeNode(7);

        InorderTreeTraversal inorderLevelTraversal = new InorderTreeTraversal();
        Assert.assertArrayEquals(new Integer[]{2, 5, 7}, inorderLevelTraversal.inorderTraversal(root).toArray(new Integer[1]));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        root.left =  new TreeNode(2);
        root.right =  new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        InorderTreeTraversal inorderLevelTraversal = new InorderTreeTraversal();
        Assert.assertArrayEquals(new Integer[]{4, 2, 5, 1, 3}, inorderLevelTraversal.inorderTraversal(root).toArray(new Integer[1]));
    }
}
