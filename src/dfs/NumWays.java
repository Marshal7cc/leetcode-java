package dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/7/3
 */
public class NumWays {
    List<List<Integer>> edges;
    private int n;
    private int k;
    private int ans;

    public int numWays(int n, int[][] relation, int k) {
        this.n = n;
        this.k = k;
        this.ans = 0;

        // 转换成方便取数的数据结构
        edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int[] edge : relation) {
            int src = edge[0], dst = edge[1];
            edges.get(src).add(dst);
        }


        // 第0次得到的结果是0]
        dfs(0, 0);

        return ans;
    }

    /**
     * 第times次得到的index[第0次得到的结果是0]
     *
     * @param times
     * @param index
     */
    private void dfs(int times, int index) {
        if (times > k) {
            return;
        }
        if (times == k && index == n - 1) {
            ans++;
            return;
        }
        List<Integer> list = edges.get(index);
        for (Integer next : list) {
            dfs(times + 1, next);
        }
    }
}
