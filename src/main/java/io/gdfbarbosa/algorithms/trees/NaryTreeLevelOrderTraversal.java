package io.gdfbarbosa.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/n-ary-tree-level-order-traversal/">429. N-ary Tree Level Order Traversal</a>
 */
public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        setOrder(list, root, 0);
        return list;
    }

    public void setOrder(List<List<Integer>> list, Node root, int depth) {
        if (root == null) return;
        if (list.size() == depth) {
            list.add(new ArrayList<>());
        }
        list.get(depth).add(root.val);
        for (Node n : root.children) {
            setOrder(list, n, depth + 1);
        }
    }
}
