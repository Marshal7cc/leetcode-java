package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/6/22
 */
public class Permutation {
    List<String> ans;
    boolean[] vis;

    public String[] permutation(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        ans = new ArrayList<>();
        vis = new boolean[n];
        backtrack(arr, 0, n, new StringBuilder());

        String[] res = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    private void backtrack(char[] arr, int i, int n, StringBuilder sb) {
        if (i == n) {
            ans.add(sb.toString());
            return;
        }
        for (int j = 0; j < n; j++) {
            if (vis[j] || (j > 0 && !vis[j - 1] && arr[j - 1] == arr[j])) {
                continue;
            }
            vis[j] = true;
            sb.append(arr[j]);
            backtrack(arr, i + 1, n, sb);
            sb.deleteCharAt(sb.length() - 1);
            vis[j] = false;
        }
    }
}
