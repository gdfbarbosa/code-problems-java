package io.gdfbarbosa.algorithms.trees;

/**
 * <a href="https://leetcode.com/problems/path-sum/description/">112. Path Sum</a>
 */
public class BinaryTreePathSum {
    boolean hasPathSum = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        hasPathSumHelper(root, targetSum, 0);
        return hasPathSum;
    }

    public void hasPathSumHelper(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return;
        }
        sum += root.val;
        boolean isLeafNode = root.left == null && root.right == null;
        if (isLeafNode && sum == targetSum) {
            hasPathSum = true;
        }
        hasPathSumHelper(root.left, targetSum, sum);
        hasPathSumHelper(root.right, targetSum, sum);
    }
}
