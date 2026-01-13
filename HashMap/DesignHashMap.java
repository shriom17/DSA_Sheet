import java.util.ArrayList;

class MyHashMap {

    // Pair class to store key-value
    static class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int SIZE = 1000;
    private ArrayList<Pair>[] buckets;

    public MyHashMap() {
        buckets = new ArrayList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public void put(int key, int value) {
        int index = key % SIZE;
        ArrayList<Pair> bucket = buckets[index];

        for (Pair p : bucket) {
            if (p.key == key) {
                p.value = value;   // update
                return;
            }
        }
        bucket.add(new Pair(key, value)); // new entry
    }

    public int get(int key) {
        int index = key % SIZE;
        ArrayList<Pair> bucket = buckets[index];

        for (Pair p : bucket) {
            if (p.key == key) {
                return p.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = key % SIZE;
        ArrayList<Pair> bucket = buckets[index];

        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).key == key) {
                bucket.remove(i);
                return;
            }
        }
    }
}
