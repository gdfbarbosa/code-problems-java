package io.gdfbarbosa.algorithms.trees;

import com.sun.source.tree.Tree;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PreorderTreeTraversalTest {
    @Test
    public void test1() {
        PreorderTreeTraversal preorderTreeTraversal = new PreorderTreeTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        Assert.assertArrayEquals(new Integer[]{3, 1, 5}, preorderTreeTraversal.preorderTraversal(root).toArray(new Integer[0]));
    }

    @Test
    public void test2() {
        PreorderTreeTraversal preorderTreeTraversal = new PreorderTreeTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Assert.assertArrayEquals(new Integer[]{1, 2, 4, 5, 3}, preorderTreeTraversal.preorderTraversal(root).toArray(new Integer[0]));
    }
}
