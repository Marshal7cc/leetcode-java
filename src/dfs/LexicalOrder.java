package dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Marshal
 * @date 2021/6/25
 */
public class LexicalOrder {
    /**
     * Force Solution
     *
     * @param n
     * @return
     */
    public List<Integer> lexicalOrderForce(int n) {
        List<String> s = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            s.add(String.valueOf(i));
        }
        Collections.sort(s);
        return s.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

    /**
     * DFS Solution
     *
     * @param n
     * @return
     */
    public List<Integer> lexicalOrderDFS(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            dfs(ans, i, n);
        }
        return ans;
    }

    private void dfs(List<Integer> ans, int i, int n) {
        if (i <= n) {
            ans.add(i);
        } else {
            return;
        }
        for (int j = 0; j <= 9; j++) {
            dfs(ans, j + 10 * i, n);
        }
    }
}
