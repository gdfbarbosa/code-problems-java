package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeZigzagLevelOrderTraversalTest {
    @Test
    public void zigzagLevelOrder() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(3));
        expected.add(Arrays.asList(20,9));
        expected.add(Arrays.asList(15,7));

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BinaryTreeZigzagLevelOrderTraversal binaryTreeZigzagLevelOrderTraversal =
                new BinaryTreeZigzagLevelOrderTraversal();
        assertEquals(expected, binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root));
    }
}