package dfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author Marshal
 * @date 2021/6/26
 */
public class SlidingPuzzle {
    protected static final String TARGET = "123450";
    protected static final int[][] NEIGHBOR = {{1, 3}, {0, 4, 2}, {1, 5}, {0, 4}, {1, 3, 5}, {2, 4}};

    public int slidingPuzzle(int[][] board) {
        int m = 2;
        int n = 3;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(board[i][j]);
            }
        }

        String initial = sb.toString();
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.offer(initial);
        visited.add(initial);
        int step = 0;
        while (!q.isEmpty()) {

            int sz = q.size();
            for (int i = 0; i < sz; i++) {

                String cur = q.poll();
                // 判断是否到达目标局面
                if (TARGET.equals(cur)) {
                    return step;
                }

                // 找到数字 0 的索引
                int pos = cur.indexOf('0');
                // 将数字 0 和相邻的数字交换位置
                for (int adj : NEIGHBOR[pos]) {

                    String new_board = swap(cur, adj, pos);
                    // 防止走回头路
                    if (!visited.contains(new_board)) {

                        visited.add(new_board);
                        q.offer(new_board);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    public String swap(String str, int src, int dst) {

        char[] arr = str.toCharArray();

        char temp = arr[src];
        arr[src] = arr[dst];
        arr[dst] = temp;
        return new String(arr);
    }
}
