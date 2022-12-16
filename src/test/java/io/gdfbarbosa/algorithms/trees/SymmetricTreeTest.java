package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class SymmetricTreeTest {
    @Test
    public void isSymmetric() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        assertTrue(new SymmetricTree().isSymmetric(root));
    }
}