package Map;

import java.util.*;

public class HashMap_Implementation {
    // implement using separate hashing

    public static class MyHashMap<k, v> {
        public static final int Default_Capacity = 4;
        public static final float Default_load_factor = 0.75f;

        private class Node {
            k key;
            v value;

            Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // no of entries in map

        private LinkedList<Node>[] buckets;


        private void initBuckets(int N) { // N=capacity/ size of bucket array
            // new array of LL of size N
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>(); // empty linked list at i index
            }

        }

        // traverse the ll and looks for a node with key , if found it returns it's index otherwise it returns null
        private int HashFun(k key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll, k key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap() {
            initBuckets(Default_Capacity);
        }

        public int capacity() {
            return buckets.length;
        }

        public float load() {
            return (n * 1.0f) / buckets.length;
        }

        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for (var bucket : oldBuckets) {
                for (var node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public int size() { // return no of entries
            return n;
        }

        public void put(k key, v value) { // insert and update
            int bi = HashFun(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) {
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else { // update case
                Node currNode = currBucket.get(ei);
                currNode.value = value;

            }
            if (n >= buckets.length * Default_load_factor) {
                rehash();
            }
        }

        public v get(k key) { // get value
            int bi = HashFun(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) return null;
            else {
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
        }

        public v remove(k key) { // return deleting value
            int bi = HashFun(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) {
                return null;
            } else {
                Node currNode = currBucket.get(ei);
                v val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
        }

        public static void display() {

        }


    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        mp.put("d", 4);
        System.out.println("load" + mp.load());
        mp.put("e", 5);
        mp.put("f", 6);
        System.out.println("testing size : " + mp.size()); // 6
        System.out.println("testing value at c : " + mp.get("c")); //3
        mp.put("c", 30);
        System.out.println("testing size : " + mp.size());//6
        System.out.println("testing value at c : " + mp.get("c"));//30
        System.out.println(mp.remove("g"));//null
        System.out.println(mp.remove("b"));//2
        System.out.println(mp.get("b"));//null
        System.out.println(mp.size());//5
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        mp.put("d", 4);

        mp.put("x", 65);
        System.out.println(mp.get("x"));
        System.out.println("capacity : " + mp.capacity());
        System.out.println("load : " + mp.load());
    }
}