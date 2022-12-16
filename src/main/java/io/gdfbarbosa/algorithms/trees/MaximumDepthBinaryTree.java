package io.gdfbarbosa.algorithms.trees;

/**
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/description/">104. Maximum Depth of Binary Tree</a>
 */
public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        if (root == null) {
            return maxDepth;
        }
        return maxDepthHelper(root, maxDepth);
    }

    public int maxDepthHelper(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        int leftDepth = maxDepthHelper(root.left, depth + 1);
        int rightDepth = maxDepthHelper(root.right, depth + 1);
        return Math.max(leftDepth, rightDepth);
    }
}
