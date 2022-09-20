package io.gdfbarbosa.algorithms.trees;

import javafx.util.Pair;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/">987. Vertical Order Traversal of a Binary Tree</a>
 */
public class VerticalOrderTraversalBinaryTree {
    Map<Integer, ArrayList<Pair<Integer, Integer>>> columnTable = new HashMap<>();
    int minColumn = 0, maxColumn = 0;

    private void DFS(TreeNode node, Integer row, Integer column) {
        if (node == null)
            return;

        if (!columnTable.containsKey(column)) {
            this.columnTable.put(column, new ArrayList<>());
        }

        this.columnTable.get(column).add(new Pair<>(row, node.val));
        this.minColumn = Math.min(minColumn, column);
        this.maxColumn = Math.max(maxColumn, column);
        // preorder DFS traversal
        this.DFS(node.left, row + 1, column - 1);
        this.DFS(node.right, row + 1, column + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root == null) {
            return output;
        }

        // step 1). DFS traversal
        this.DFS(root, 0, 0);

        // step 2). retrieve the value from the columnTable
        for (int i = minColumn; i < maxColumn + 1; ++i) {
            // order by both "row" and "value"
            columnTable.get(i).sort((p1, p2) -> {
                if (p1.getKey().equals(p2.getKey()))
                    return p1.getValue() - p2.getValue();
                else
                    return p1.getKey() - p2.getKey();
            });

            List<Integer> sortedColumn = new ArrayList<>();
            for (Pair<Integer, Integer> p : columnTable.get(i)) {
                sortedColumn.add(p.getValue());
            }
            output.add(sortedColumn);
        }
        return output;
    }
}
