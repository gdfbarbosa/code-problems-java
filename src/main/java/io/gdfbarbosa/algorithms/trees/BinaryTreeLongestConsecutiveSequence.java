package io.gdfbarbosa.algorithms.trees;

/**
 * <a href="https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/">298. Binary Tree Longest Consecutive Sequence</a>
 */
public class BinaryTreeLongestConsecutiveSequence {
    public int max = 0;
    public int longestConsecutive(TreeNode root) {
        depthFirstSearch(root, 0, root.val);
        return max;
    }

    public void depthFirstSearch(TreeNode node, int cur, int value) {
        if (node == null) {
            return;
        }
        if (node.val == value) {
            cur++;
        } else {
            cur = 1; // count the starting node
        }
        max = Math.max(cur, max);
        depthFirstSearch(node.left, cur, node.val + 1);
        depthFirstSearch(node.right, cur, node.val + 1);
    }
}
