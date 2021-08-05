package dfs;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/8/5
 */
public class EventualSafeNodes {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        int[] color = new int[n];
        List<Integer> ans = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (safe(graph, color, i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    private boolean safe(int[][] graph, int[] color, int i) {
        if (color[i] != 0) {
            return color[i] == 2;
        }

        color[i] = 1;
        for (int y : graph[i]) {
            if (!safe(graph, color, y)) {
                return false;
            }
        }
        color[i] = 2;
        return true;
    }
}
