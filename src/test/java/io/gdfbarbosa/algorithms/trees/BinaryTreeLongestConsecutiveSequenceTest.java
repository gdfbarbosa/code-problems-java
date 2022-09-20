package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeLongestConsecutiveSequenceTest {
    @Test
    public void longestConsecutive1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);

        BinaryTreeLongestConsecutiveSequence binaryTreeLongestConsecutiveSequence =
                new BinaryTreeLongestConsecutiveSequence();
        assertEquals(3, binaryTreeLongestConsecutiveSequence.longestConsecutive(root));
    }

    @Test
    public void longestConsecutive2() {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(1);

        BinaryTreeLongestConsecutiveSequence binaryTreeLongestConsecutiveSequence =
                new BinaryTreeLongestConsecutiveSequence();
        assertEquals(2, binaryTreeLongestConsecutiveSequence.longestConsecutive(root));
    }
}