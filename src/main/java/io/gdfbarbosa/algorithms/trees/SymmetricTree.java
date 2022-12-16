package io.gdfbarbosa.algorithms.trees;

/**
 * <a href="https://leetcode.com/problems/symmetric-tree/">101. Symmetric Tree</a>
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && // root node
                isMirror(node1.right, node2.left) && // node2 subtree
                isMirror(node1.left, node2.right); // node1 subtree
    }
}
