package dp;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/3/7
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int len = s.length();
        // 保存dp前置结果
        boolean[][] arr = new boolean[len][len];
        // 初始化全部为true
        for (boolean[] a : arr) {
            Arrays.fill(a, true);
        }
        String ans = null;
        // 状态转移方程:f[m][n] = f[m+1][n-1]&& s[m]==s[n],其中m<n
        // 所以i从len-1递减,j从i+1递增
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                arr[i][j] = arr[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                if (arr[i][j]) {
                    ans = (ans != null && ans.length() > (j - i + 1)) ? ans : s.substring(i, j + 1);
                }
            }
        }
        // 上面没考虑 i=j 的情况
        if (ans == null) {
            return s.substring(0, 1);
        }
        return ans;
    }
}
