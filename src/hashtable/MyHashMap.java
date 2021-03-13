package hashtable;

import java.util.LinkedList;

/**
 * @author Marshal
 * @date 2021/3/13
 */
public class MyHashMap {
    private static final int BASE = 769;
    private final LinkedList<Integer[]>[] data;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
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

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int hash = hash(key);
        LinkedList<Integer[]> list = data[hash];
        for (Integer[] ele : list) {
            if (ele[0] == key) {
                ele[1] = value;
                return;
            }
        }
        list.offerLast(new Integer[]{key, value});
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int hash = hash(key);
        LinkedList<Integer[]> list = data[hash];
        for (Integer[] ele : list) {
            if (ele[0] == key) {
                return ele[1];
            }
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int hash = hash(key);
        LinkedList<Integer[]> list = data[hash];
        for (Integer[] ele : list) {
            if (ele[0] == key) {
                list.remove(ele);
                return;
            }
        }
    }
}
