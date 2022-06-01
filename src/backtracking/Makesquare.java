package backtracking;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2022/6/1
 */
public class Makesquare {
    public boolean makesquare(int[] matchsticks) {
        int totalLength = Arrays.stream(matchsticks).sum();
        if (totalLength % 4 != 0) {
            return false;
        }

        Arrays.sort(matchsticks);
        // 从大到小
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }


        int[] edges = new int[4];
        return dfs(0, matchsticks, edges, totalLength / 4);
    }

    public boolean dfs(int index, int[] matchsticks, int[] edges, int len) {
        if (index == matchsticks.length) {
            return true;
        }
        for (int i = 0; i < edges.length; i++) {
            edges[i] += matchsticks[index];
            if (edges[i] <= len && dfs(index + 1, matchsticks, edges, len)) {
                return true;
            }
            edges[i] -= matchsticks[index];
        }
        return false;
    }
}
