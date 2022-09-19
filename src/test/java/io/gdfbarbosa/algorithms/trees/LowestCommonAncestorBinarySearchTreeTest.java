package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class LowestCommonAncestorBinarySearchTreeTest {

    @Test
    public void lowestCommonAncestor1() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        LowestCommonAncestorBinarySearchTree lowestCommonAncestorBinarySearchTree = new LowestCommonAncestorBinarySearchTree();
        assertEquals(root,
                lowestCommonAncestorBinarySearchTree
                        .lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)));
    }

    @Test
    public void lowestCommonAncestor2() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        LowestCommonAncestorBinarySearchTree lowestCommonAncestorBinarySearchTree = new LowestCommonAncestorBinarySearchTree();
        assertEquals(root.left,
                lowestCommonAncestorBinarySearchTree
                        .lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)));
    }
}