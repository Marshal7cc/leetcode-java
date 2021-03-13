package hashtable;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/3/13
 */
public class MyHashSet {
    private static final int BASE = 769;
    private final LinkedList<Integer>[] data;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            data[i] = new LinkedList<>();
        }
    }

    /**
     * 链地址法
     *
     * @param key
     * @return
     */
    private static int hash(int key) {
        return key % BASE;
    }

    public void add(int key) {
        int hash = hash(key);
        LinkedList<Integer> list = data[hash];
        for (Integer ele : list) {
            if (ele == key) {
                return;
            }
        }
        list.offerLast(key);
    }

    public void remove(int key) {
        int hash = hash(key);
        List<Integer> list = data[hash];
        for (Integer element : list) {
            if (element == key) {
                list.remove(element);
                return;
            }
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int hash = hash(key);
        List<Integer> list = data[hash];
        for (Integer ele : list) {
            if (ele == key) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
