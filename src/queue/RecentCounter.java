package queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Marshal
 * @since 2022/5/6
 */
public class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        this.queue.offer(t);
        while (queue.peek() != null && queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
