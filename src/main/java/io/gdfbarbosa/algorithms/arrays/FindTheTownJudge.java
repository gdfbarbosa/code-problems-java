package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/find-the-town-judge/">997. Find the Town Judge</a>
 */
public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] whoTrusts = new int[n+1];
        int[] personTrusts = new int[n+1];
        for (int[] ints : trust) {
            whoTrusts[ints[1]]++;
            personTrusts[ints[0]] = ints[1];
        }
        for (int i = 1; i <= n; i++) {
            if (whoTrusts[i] == n -1 && personTrusts[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
