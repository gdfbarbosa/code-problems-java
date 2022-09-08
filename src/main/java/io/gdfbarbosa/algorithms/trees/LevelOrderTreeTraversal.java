package io.gdfbarbosa.algorithms.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Breadth-First or Level Order Traversal.
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/">102. Binary Tree Level Order Traversal</a>
 */
public class LevelOrderTreeTraversal {
    // Breath First Search is faster without queue
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelOrderTraversal(res, root, 0);
        return res;
    }

    public void levelOrderTraversal(List<List<Integer>> res, TreeNode node, int height) {
        if (node == null) return;
        if (height == res.size()) {
            res.add(new LinkedList<>());
        }
        res.get(height).add(node.val);
        levelOrderTraversal(res, node.left, height+1);
        levelOrderTraversal(res, node.right, height+1);
    }
}
