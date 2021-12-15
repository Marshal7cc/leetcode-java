package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author Marshal
 * @since 2021/12/15
 */
public class LoudAndRich {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        // 用数组构建有向无环图，钱多->钱少
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; ++i) {
            g[i] = new ArrayList<>();
        }
        // 入度，用于构建拓扑排序
        int[] inDeg = new int[n];
        for (int[] r : richer) {
            g[r[0]].add(r[1]);
            ++inDeg[r[1]];
        }

        // 答案
        int[] ans = new int[n];
        // 先把答案初始化为自己
        for (int i = 0; i < n; ++i) {
            ans[i] = i;
        }
        // 入度为0的放在先入队
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; ++i) {
            if (inDeg[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int x = q.poll();
            for (int y : g[x]) {
                if (quiet[ans[x]] < quiet[ans[y]]) {
                    // 更新 x 的邻居的答案
                    ans[y] = ans[x];
                }
                if (--inDeg[y] == 0) {
                    q.offer(y);
                }
            }
        }
        return ans;
    }
}
