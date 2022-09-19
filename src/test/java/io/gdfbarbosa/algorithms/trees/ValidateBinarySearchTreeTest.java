package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidateBinarySearchTreeTest {
    @Test
    public void isValidBinarySearchTreeShouldValidate() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        assertTrue(validateBinarySearchTree.isValidBST(root));
    }

    @Test
    public void isValidBinarySearchTreeShouldInvalidate() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        assertFalse(validateBinarySearchTree.isValidBST(root));
    }
}