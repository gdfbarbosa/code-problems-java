package io.gdfbarbosa.algorithms.trees;

/**
 * <a href="https://leetcode.com/problems/construct-string-from-binary-tree/">606. Construct String from Binary Tree</a>
 */
public class ConstructStringFromBinaryTree {

    StringBuilder val = new StringBuilder();
    public String tree2str(TreeNode root) {
        if (root == null) return "";
        val.append(root.val);
        if (root.left == null && root.right != null) {
            val.append("()");
        }
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return val.toString();
    }

    public void preorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        val.append("(").append(node.val);
        if (node.left != null || node.right != null) {
            if (node.left == null) {
                val.append("()");
            }
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
        val.append(")");
    }
}
