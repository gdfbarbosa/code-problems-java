package io.gdfbarbosa.algorithms.design;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * LRU Cache implemented as a DoubleLinkedList. Basically it combines a Double Linked List with a Map
 * implementation.
 * <a href="https://leetcode.com/problems/lru-cache">146. LRU Cache</a>
 */
public class LRUCache extends LinkedHashMap<Integer, Integer> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    public Integer get(Object key) {
        return super.getOrDefault(key, -1);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > this.capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LRUCache lruCache = (LRUCache) o;
        return capacity == lruCache.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }
}
