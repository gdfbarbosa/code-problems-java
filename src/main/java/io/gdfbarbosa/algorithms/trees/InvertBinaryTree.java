package io.gdfbarbosa.algorithms.trees;

/**
 * Invert binary tree swapping nodes left and right.
 * <a href="https://leetcode.com/problems/invert-binary-tree">226. Invert Binary Tree</a>
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
