package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class VerticalOrderTraversalBinaryTreeTest {
    @Test
    public void verticalTraversal1() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(9));
        expected.add(Arrays.asList(3,15));
        expected.add(Collections.singletonList(20));
        expected.add(Collections.singletonList(7));

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        VerticalOrderTraversalBinaryTree verticalOrderTraversalBinaryTree = new
                VerticalOrderTraversalBinaryTree();
        assertEquals(expected, verticalOrderTraversalBinaryTree.verticalTraversal(root));
    }

    @Test
    public void verticalTraversal2() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(4));
        expected.add(Collections.singletonList(2));
        expected.add(Arrays.asList(1,5,6));
        expected.add(Collections.singletonList(3));
        expected.add(Collections.singletonList(7));

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        VerticalOrderTraversalBinaryTree verticalOrderTraversalBinaryTree = new
                VerticalOrderTraversalBinaryTree();
        assertEquals(expected, verticalOrderTraversalBinaryTree.verticalTraversal(root));
    }

    @Test
    public void verticalTraversal3() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(4));
        expected.add(Collections.singletonList(2));
        expected.add(Arrays.asList(1,5,6));
        expected.add(Collections.singletonList(3));
        expected.add(Collections.singletonList(7));

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        VerticalOrderTraversalBinaryTree verticalOrderTraversalBinaryTree = new
                VerticalOrderTraversalBinaryTree();
        assertEquals(expected, verticalOrderTraversalBinaryTree.verticalTraversal(root));
    }
}