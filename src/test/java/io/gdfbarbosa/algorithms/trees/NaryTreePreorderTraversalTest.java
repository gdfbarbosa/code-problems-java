package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NaryTreePreorderTraversalTest {

    @Test
    public void preorder() {
        Node node3 = new Node(3, Arrays.asList(
                new Node(5), new Node(6)
        ));
        Node root = new Node(1, Arrays.asList(
                node3,new Node(2),new Node(4)));
        NaryTreePreorderTraversal treePreorderTraversal = new NaryTreePreorderTraversal();
        assertEquals(Arrays.asList(1,3,5,6,2,4),
                treePreorderTraversal.preorder(root));
    }
}