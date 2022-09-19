package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructStringFromBinaryTreeTest {

    @Test
    public void tree2str() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        ConstructStringFromBinaryTree constructStringFromBinaryTree = new
                ConstructStringFromBinaryTree();
        assertEquals("1(2(4))(3)", constructStringFromBinaryTree.tree2str(root));
    }

    @Test
    public void tree2str2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        ConstructStringFromBinaryTree constructStringFromBinaryTree = new
                ConstructStringFromBinaryTree();
        assertEquals("1(2()(4))(3)", constructStringFromBinaryTree.tree2str(root));
    }
}