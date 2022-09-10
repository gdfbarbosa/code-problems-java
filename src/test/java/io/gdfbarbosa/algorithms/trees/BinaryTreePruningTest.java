package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

public class BinaryTreePruningTest {
    @Test
    public void test1() {
        BinaryTreePruning binaryTreePruning = new BinaryTreePruning();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        binaryTreePruning.pruneTree(root);
    }
}
