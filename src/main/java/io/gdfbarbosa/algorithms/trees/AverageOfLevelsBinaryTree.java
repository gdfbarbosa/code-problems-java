package io.gdfbarbosa.algorithms.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/average-of-levels-in-binary-tree/">637. Average of Levels in Binary Tree</a>
 */
public class AverageOfLevelsBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        levelOrderTraversal(list, root, 0);
        for (List<Integer> integers : list) {
            double average = 0.0;
            for (Integer integer : integers) {
                average += integer;
            }
            average /= integers.size();
            averages.add(average);
        }
        return averages;
    }

    public void levelOrderTraversal(List<List<Integer>> list, TreeNode node, int level) {
        if (node == null) { // leaf
            return;
        }
        int height = list.size(); // get total height
        if (height == level) { // add new height
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val); // add value
        levelOrderTraversal(list, node.left, level + 1); // traverse left tree
        levelOrderTraversal(list, node.right, level + 1); // traverse right tree
    }
}
