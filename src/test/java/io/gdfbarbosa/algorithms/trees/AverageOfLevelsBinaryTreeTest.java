package io.gdfbarbosa.algorithms.trees;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AverageOfLevelsBinaryTreeTest {
    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        AverageOfLevelsBinaryTree averageOfLevelsBinaryTree = new AverageOfLevelsBinaryTree();
        Assert.assertEquals(Arrays.asList(3.0, 14.5, 11.0), averageOfLevelsBinaryTree.averageOfLevels(root));
    }
}
