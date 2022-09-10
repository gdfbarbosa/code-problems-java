package io.gdfbarbosa.algorithms.trees;

/**
 * <a href="https://leetcode.com/problems/binary-tree-pruning/">814. Binary Tree Pruning</a>
 * Solution by hiepit.
 */
public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) return null;
        return root;
    }
}
