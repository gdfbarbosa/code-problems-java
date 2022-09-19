package io.gdfbarbosa.algorithms.trees;

/**
 * <a href="https://leetcode.com/problems/validate-binary-search-tree/">98. Validate Binary Search Tree</a>
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isBST(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return isBST(node.left, min, node.val) &&
                isBST(node.right, node.val, max);
    }
}
