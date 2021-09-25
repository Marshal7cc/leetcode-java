package dp;

/**
 * @author Marshal
 * @since 2021/9/25
 */
public class MinDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // 先求最大公共子字符串
        int[][] dp = new int[m + 1][n + 1];

        // i,j代表长度
        // dp[0][j] = 0 dp[i][0] = 0
        for (int i = 1; i <= m; i++) {
            char c1 = word1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = word2.charAt(j - 1);

                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }


        return m + n - 2 * dp[m][n];
    }
}
