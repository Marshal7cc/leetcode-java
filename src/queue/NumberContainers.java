package queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Marshal
 * @since 2025/9/17
 */
public class NumberContainers {

    private HashMap<Integer, Integer> nums;
    private Map<Integer, PriorityQueue<Integer>> q;

    public NumberContainers() {
        nums = new HashMap<>();
        q = new HashMap<>();
    }

    public void change(int index, int number) {
        nums.put(index, number);
        q.computeIfAbsent(number, o -> new PriorityQueue<>()).add(index);
    }

    public int find(int number) {
        PriorityQueue<Integer> heap = q.get(number);
        if (heap == null) {
            return -1;
        }
        while (!heap.isEmpty() && !nums.get(heap.peek()).equals(number)) {
            heap.poll();
        }

        return heap.isEmpty() ? -1 : heap.peek();
    }
}
