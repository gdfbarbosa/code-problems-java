package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PseudoPalindromicPathsBinaryTreeTest {
    static PseudoPalindromicPathsBinaryTree algorithm = new PseudoPalindromicPathsBinaryTree();
    @Test
    public void testSmallTreePseudoPalindromic() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        assertEquals(2, algorithm.pseudoPalindromicPaths(root));
    }

    @Test
    public void testBiggerTreePseudoPalindromic() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.right = new TreeNode(1);
        root.right = new TreeNode(1);
        assertEquals(1, algorithm.pseudoPalindromicPaths(root));
    }
}
