package io.gdfbarbosa.algorithms.graph;

/**
 * <a href="https://leetcode.com/explore/learn/card/graph/618/disjoint-set/3878/">Quick Find - LeetCode</a>
 */
public class QuickFind {
    private final int[] arr;

    public QuickFind(int length) {
        this.arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = i;
        }
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            // choose rootX as the new root node
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == rootY) {
                    arr[i] = rootX;
                }
            }
        }
    }

    public int find(int index) {
        return arr[index];
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}
