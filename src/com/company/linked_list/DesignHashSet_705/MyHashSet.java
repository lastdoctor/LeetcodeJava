package com.company.linked_list.DesignHashSet_705;

import java.util.Arrays;

class MyHashSet {
    int[] bucket;
    public MyHashSet() {
        int bucketSize = (int)Math.pow(10, 6) + 1;
        bucket = new int[bucketSize];
        Arrays.fill(bucket, -1);
    }

    public void add(int key) {
        bucket[key] = key;
    }

    public void remove(int key) {
        bucket[key] = -1;
    }

    public boolean contains(int key) {
        return bucket[key] == key;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */