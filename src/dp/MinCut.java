package dp;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/3/8
 */
public class MinCut {
    public int minCut(String s) {
        int len = s.length();
        // 一次dp
        // 子串[m,n]是否为回文串预处理
        // 状态转移方程:f[m][n] = f[m+1][n-1]&& s[m]==s[n],其中m<n
        // 所以i从len-1递减,j从i+1递增
        boolean[][] res = new boolean[len][len];
        for (boolean[] arr : res) {
            Arrays.fill(arr, true);
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                res[i][j] = res[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
            }
        }
        // 二次dp
        // ans[i]=min{ans[j]}+1,且要求[j+1,i] 是一个回文串(0≤j<i)
        int[] ans = new int[len];
        Arrays.fill(ans, len - 1);
        for (int i = 0; i < len; i++) {
            if (res[0][i]) {
                ans[i] = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    if (res[j + 1][i]) {
                        ans[i] = Math.min(ans[i], ans[j] + 1);
                    }
                }
            }
        }
        return ans[len - 1];
    }
}
