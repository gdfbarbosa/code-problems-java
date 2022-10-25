package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvertBinaryTreeTest {

    @Test
    public void invertTree1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        TreeNode invertedTree = new TreeNode(2);
        invertedTree.left = new TreeNode(3);
        invertedTree.right = new TreeNode(1);

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        assertEquals(invertedTree, invertBinaryTree.invertTree(root));
    }

    @Test
    public void invertTree2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode invertedTree = new TreeNode(4);
        invertedTree.left = new TreeNode(7);
        invertedTree.left.left = new TreeNode(9);
        invertedTree.left.right = new TreeNode(6);
        invertedTree.right = new TreeNode(2);
        invertedTree.right.left = new TreeNode(3);
        invertedTree.right.right = new TreeNode(1);

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        assertEquals(invertedTree, invertBinaryTree.invertTree(root));
    }
}