package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/3/7
 */
public class Partition {
    // 保存子串[i,j]是否为回文的状态
    boolean[][] f;
    // 总结果
    List<List<String>> ret = new ArrayList<>();
    // 存储当前分支结果
    List<String> ans = new ArrayList<>();
    // s.length
    int n;

    public List<List<String>> partition(String s) {
        n = s.length();
        // 子串预处理:预先判断子串是否为回文
        // 状态转移方程:f[m][n] = f[m+1][n-1]&& s[m]==s[n],其中m<n
        // 所以i从len-1递减,j从i+1递增
        f = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(f[i], true);
        }
        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                f[i][j] = (s.charAt(i) == s.charAt(j)) && f[i + 1][j - 1];
            }
        }

        // dfs 从0开始的dfs
        dfs(s, 0);
        return ret;
    }

    public void dfs(String s, int i) {
        // 遍历到最后，当次搜索出结果
        if (i == n) {
            ret.add(new ArrayList<>(ans));
            return;
        }
        // 树形搜素,首次共n个分支，依次向下延展
        //                          root
        //  各分支:  s[0]  |  s[0,1]  |  s[0,1,2]  | ...  | s[0,...,n-1]
        //  s[0]满足==>再看以s[0]为root的子分支:
        for (int j = i; j < n; ++j) {
            if (f[i][j]) {
                // 如果[i,j]是回文串，则将其加入本次ans[]
                ans.add(s.substring(i, j + 1));
                // 从j+1开始继续
                dfs(s, j + 1);
                // 清空ans数组用作下次结果（回溯体现）
                ans.remove(ans.size() - 1);
            }
        }
    }
}
