package io.gdfbarbosa.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary tree node with pointer for left and right nodes.
 * Value is always integer.
 */
class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val) {
        this.val = val;
    }
}

/**
 * <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">94. Binary Tree Inorder Traversal</a>
 */
public class InorderTreeLevelTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorderTraversalHelper(root, ans);
        return ans;
    }

    public void inorderTraversalHelper(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inorderTraversalHelper(node.left, list);
        list.add(node.val);
        inorderTraversalHelper(node.right, list);
    }
}
