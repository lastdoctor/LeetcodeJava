package cronis.hash_table;

// Обьект связанного списка из пар ключ значение
class Bucket {
    public String key;
    public int value;
    public Bucket next;

    Bucket(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

class HashTable {
    int[] primes = {5, 11, 23, 47, 97};
    int size = 0;
    int capacityIndex = 0;
    Bucket[] buckets = new Bucket[primes[capacityIndex]];

    int hashCode(String str) {
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            int letterCode = str.charAt(i);
            hash = (hash << 5) - hash + letterCode; // hash << 5 = hash*5
        }
        return hash;
    }

    int getBucketIndex(String key) {
        int capacity = primes[capacityIndex];
        return Math.abs(this.hashCode(key) % capacity);
    }

    boolean loadFactorIsBad() {
        double loadFactor = 0.75;
        int capacity = primes[capacityIndex];
        return (double) size / capacity >= loadFactor;
    }

    void addOrUpdate(String key, int value) {
        int bucketIndex = getBucketIndex(key);
        Bucket bucket = buckets[bucketIndex];
        while (bucket != null) {
            if (bucket.key.equals(key)) {
                bucket.value = value;
                return;
            }
            bucket = bucket.next;
        }
        Bucket newNode = new Bucket(key, value);
        newNode.next = buckets[bucketIndex];
        buckets[bucketIndex] = newNode;

        size++;
    }
}
