package cronis.hash_table;

import java.util.Arrays;

// Обьект связанного списка из пар ключ значение
class Bucket {
    public String key;
    public int value;
    public Bucket next;

    Bucket(String key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "key='" + key + '\'' +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}

// Метод цепочек
class HashTable {
    private int[] primes = {5, 11, 23, 47, 97};
    private int size = 0;
    private int capacityIndex = 0;
    private Bucket[] buckets = new Bucket[primes[capacityIndex]];

    private int hashCode(String str) {
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            int letterCode = str.charAt(i);
            hash = (hash << 5) - hash + letterCode; // hash << 5 = hash*5
        }
        return hash;
    }

    private int getBucketIndex(String key) {
        int capacity = primes[capacityIndex];
        return Math.abs(this.hashCode(key) % capacity);
    }

    private boolean loadFactorIsBad() {
        double loadFactor = 0.75;
        int capacity = primes[capacityIndex];
        return (double) size / capacity >= loadFactor;
    }

    public void addOrUpdate(String key, int value) {
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

    private void doubleBucketSize() {
        size = 0;
        Bucket[] oldBucket = buckets;
        int doubledCapacity = primes[capacityIndex++];
        buckets = new Bucket[doubledCapacity];
        for (Bucket bucket : oldBucket) {
            while (bucket != null) {
                addOrUpdate(bucket.key, bucket.value);
                bucket = bucket.next;
            }
        }
    }

    public void insert(String key, int value) {
        if (loadFactorIsBad()) doubleBucketSize();
        addOrUpdate(key, value);
    }

    public Integer get(String key) {
        int bucketIndex = getBucketIndex(key);
        Bucket bucketNode = buckets[bucketIndex];

        while (bucketNode != null) {
            if (bucketNode.key.equals(key)) {
                return bucketNode.value;
            }
            bucketNode = bucketNode.next;
        }
        return null;
    }

    public void remove(String key) {
        int bucketIndex = getBucketIndex(key);
        Bucket bucketNode = buckets[bucketIndex];
        Bucket prev = null;

        while (bucketNode != null) {
            if (bucketNode.key.equals(key))
                break;
            prev = bucketNode;
            bucketNode = bucketNode.next;
        }

        Bucket toDelete = bucketNode;
        if (toDelete == null) return;
        if (prev != null)
            buckets[bucketIndex] = toDelete.next;
        else
            prev.next = toDelete.next;

        size--;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "primes=" + Arrays.toString(primes) +
                ", size=" + size +
                ", capacityIndex=" + capacityIndex +
                ", buckets=" + Arrays.toString(buckets) +
                '}';
    }
}

// Линейное зондирование
class HashTable1 {
    private int[] primes = {5, 11, 23, 47, 97};
    private int size = 0;
    private int capacityIndex = 0;
    private Bucket[] buckets = new Bucket[primes[capacityIndex]];

    private int hashCode(String str) {
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            int letterCode = str.charAt(i);
            hash = (hash << 5) - hash + letterCode; // hash << 5 = hash*5
        }
        return hash;
    }

    private int getBucketIndex(String key) {
        int capacity = primes[capacityIndex];
        return Math.abs(this.hashCode(key) % capacity);
    }

    private boolean loadFactorIsBad() {
        double loadFactor = 0.75;
        int capacity = primes[capacityIndex];
        return (double) size / capacity >= loadFactor;
    }

    public void addOrUpdate(String key, int value) {
        int i = getBucketIndex(key);
        while (buckets[i] != null && buckets[i].key != null) {
            if (buckets[i].key.equals(key)) {
                buckets[i].value = value;
                return;
            }
            i = (i + 1) % primes[capacityIndex];
        }

        buckets[i] = new Bucket(key, value);
        size++;
    }

    private void doubleBucketSize() {
        size = 0;
        Bucket[] oldBucket = buckets;
        int doubledCapacity = primes[capacityIndex++];
        buckets = new Bucket[doubledCapacity];
        for (Bucket bucket : oldBucket) {
            if (bucket != null && bucket.key != null) {
                addOrUpdate(bucket.key, bucket.value);
            }
        }
    }

    public void insert(String key, int value) {
        if (loadFactorIsBad()) doubleBucketSize();
        addOrUpdate(key, value);
    }

    public Integer get(String key) {
        int i = getBucketIndex(key);

        while (buckets[i] != null) {
            if (buckets[i].key != null && buckets[i].key.equals(key)) {
                return buckets[i].value;
            }
            i = (i + 1) % primes[capacityIndex];
        }
        return null;
    }

    public void remove(String key) {
        int i = getBucketIndex(key);
        while (buckets[i] != null) {
            if (buckets[i].key != null && buckets[i].key.equals(key)) {
                int next = (i + 1) % primes[capacityIndex];
                if (buckets[next] == null) {
                    buckets[i] = null;
                } else {
                    buckets[i].key = null;
                }

                size--;
                return;
            }

            i = (i + 1) % primes[capacityIndex];
        }
    }
}

// Квадратичный поиск
class HashTable2 {
    private int size = 0;
    private int capacity = 16;
    Bucket[] buckets = new Bucket[capacity];

    private int hashCode(String str) {
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            int letterCode = str.charAt(i);
            hash = (hash << 5) - hash + letterCode; // hash << 5 = hash*5
        }
        return hash;
    }

    private int getBucketIndex(String key) {
        int s = capacity;
        int h = hashCode(key);
        double A = (Math.sqrt(5) - 1) / 2;
        return (int) (s * ((h * A) % 1));
    }

    private void doubleBucketSize() {
        size = 0;

        Bucket[] oldBuckets = buckets;
        capacity = 2 * capacity;
        buckets = new Bucket[capacity];

        for (Bucket oldBucket : oldBuckets) {
            if (oldBucket != null && oldBucket.key != null) {
                addOrUpdate(oldBucket.key, oldBucket.value);
            }
        }
    }
//
//    private boolean loadFactorIsBad() {
//        double loadFactor = 0.75;
//        int capacity = primes[capacityIndex];
//        return (double) size / capacity >= loadFactor;
//    }

//    public void insert(String key, int value) {
//        if (loadFactorIsBad()) {
//            doubleBucketSize();
//        }
//        addOrUpdate(key, value);
//    }

    public void addOrUpdate(String key, int value) {
        int bucketIndex = getBucketIndex(key);
        int i = 1;

        while (buckets[bucketIndex] != null && buckets[bucketIndex].key != null) {
            if (buckets[bucketIndex].key.equals(key)) {
                buckets[bucketIndex].value = value;
                return;
            }

            bucketIndex = (bucketIndex + i) % buckets.length;
            i++;
        }

        buckets[bucketIndex] = new Bucket(key, value);
        size++;
    }
}

class Main {
    public static void main(String[] args) {
        var table = new HashTable1();
        table.addOrUpdate("hello", 10);
        table.addOrUpdate("world", 10);
        int value = table.get("hello");
        table.addOrUpdate("hello", 20);
        value = table.get("hello");
        System.out.println(value);
        System.out.println(table);
    }
}