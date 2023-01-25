package io.gdfbarbosa.algorithms.graph;

/**
 * <a href="https://leetcode.com/explore/learn/card/graph/618/disjoint-set/3840/">QuickUnion - LeetCode</a>
 */
public class QuickUnion {
    private final int[] arr;

    public QuickUnion(int length) {
        this.arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = i;
        }
    }

    public int find(int index) {
        while (this.arr[index] != index) {
            index = this.arr[index];
        }
        return index;
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            this.arr[rootY] = rootX;
        }
    }

    public boolean connected(int x, int y) {
        return this.find(x) == this.find(y);
    }
}
