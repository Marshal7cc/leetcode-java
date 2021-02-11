package priorityqueue;

import java.util.PriorityQueue;

/**
 * Priority queue是抽象集合类的一个子类，实现了Queue接口。一方面priority queue提供了标准的队列方法：
 * 将元素放入队列：add，offer
 * 将队首元素从队列删除：remove，poll
 * 查看队列内的对首元素：element，peek
 *
 * @author Marshal
 * @date 2021/2/11
 */
public class KthLargest {
    private int k;
    private PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<>();
        for (int i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        queue.offer(val);
        if (queue.size() > k) {
            queue.poll();
        }
        return queue.peek();
    }
}
