package io.gdfbarbosa.algorithms.arrays;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/open-the-lock/description/">752. Open the Lock</a>
 */
public class OpenLock {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>();
        Collections.addAll(dead, deadends);

        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        queue.offer(null);

        Set<String> visited = new HashSet<>();
        visited.add("0000");

        int depth = 0;
        while (!queue.isEmpty()) {
            String node = queue.poll();
            if (node == null) {
                depth++;
                if (!queue.isEmpty()) {
                    queue.offer(null);
                }
            } else if (node.equals(target)) {
                return depth;
            } else if (!dead.contains(node)) {
                for (String nei : neighboors(node)) {
                    if (!visited.contains(nei)) {
                        visited.add(nei);
                        queue.offer(nei);
                    }
                }
            }
        }
        return -1;
    }

    private List<String> neighboors(String code) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int x = code.charAt(i) - '0';
            for (int diff = -1; diff <= 1; diff += 2) {
                int y = (x + diff + 10) % 10;
                result.add(code.substring(0, i) + ("" + y) + code.substring(i + 1));
            }
        }
        return result;
    }
}
