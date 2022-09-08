package io.gdfbarbosa.algorithms.trees;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class LevelOrderTraversalTest {
    @Test
    public void test1() {
        LevelOrderTreeTraversal levelOrderTreeTraversal = new LevelOrderTreeTraversal();
        TreeNode root = new TreeNode(1);
        root.left =  new TreeNode(2);
        root.right =  new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<List<Integer>> expoected = new ArrayList<>();
        expoected.add(List.of(1));
        expoected.add(Arrays.asList(2,3));
        expoected.add(Arrays.asList(4,5));

        assertThat(levelOrderTreeTraversal.levelOrder(root), is(expoected));
    }
}
