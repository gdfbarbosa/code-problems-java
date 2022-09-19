package io.gdfbarbosa.algorithms.trees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class NaryTreeLevelOrderTraversalTest {

    @Test
    public void levelOrderTest1() {
        Node root = new Node(1, Arrays.asList(
                new Node(3,
                        Arrays.asList(new Node(5), new Node(6))),
                new Node(2),
                new Node(4)
        ));
        NaryTreeLevelOrderTraversal naryTreeLevelOrderTraversal = new NaryTreeLevelOrderTraversal();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(1));
        expected.add(Arrays.asList(3,2,4));
        expected.add(Arrays.asList(5,6));
        assertEquals(expected, naryTreeLevelOrderTraversal.levelOrder(root));
    }

    @Test
    public void levelOrderTest2() {
        Node root = new Node(1, Arrays.asList(
                new Node(2),
                new Node(3, Arrays.asList(new Node(6), new Node(7, Collections.singletonList(new Node(11, Collections.singletonList(new Node(14))))))),
                new Node(4, Collections.singletonList(new Node(8, Collections.singletonList(new Node(12))))),
                new Node(5, Arrays.asList(new Node(9, Collections.singletonList(new Node(13))), new Node(10)))
        ));
        NaryTreeLevelOrderTraversal naryTreeLevelOrderTraversal = new NaryTreeLevelOrderTraversal();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(1));
        expected.add(Arrays.asList(2,3,4,5));
        expected.add(Arrays.asList(6,7,8,9,10));
        expected.add(Arrays.asList(11,12,13));
        expected.add(Collections.singletonList(14));
        assertEquals(expected, naryTreeLevelOrderTraversal.levelOrder(root));
    }
}