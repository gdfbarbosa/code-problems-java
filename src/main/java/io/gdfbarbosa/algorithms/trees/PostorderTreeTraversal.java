package io.gdfbarbosa.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-postorder-traversal/">145. Binary Tree Postorder Traversal</a>
 */
public class PostorderTreeTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorderTraversalHelper(root, ans);
        return ans;
    }

    public void postorderTraversalHelper(TreeNode node, List<Integer> ans) {
        if (node == null) {
            return;
        }
        postorderTraversalHelper(node.left, ans);
        postorderTraversalHelper(node.right, ans);
        ans.add(node.val);
    }
}
