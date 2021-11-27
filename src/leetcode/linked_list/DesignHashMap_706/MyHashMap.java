package leetcode.linked_list.DesignHashMap_706;

import java.util.Arrays;

class MyHashMap {
    int[] bucket;
    public MyHashMap() {
        int bucketSize = (int)Math.pow(10, 6) + 1;
        bucket = new int[bucketSize];
        Arrays.fill(bucket, -1);
    }


    public void put(int key, int value) {
        bucket[key] = value;
    }

    public int get(int key) {
        return bucket[key];
    }

    public void remove(int key) {
        bucket[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
