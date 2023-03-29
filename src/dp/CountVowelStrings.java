package dp;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2023/3/29
 */
public class CountVowelStrings {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n][5];
        for (int i = 0; i < 5; ++i) dp[0][i] = 1;
        for (int i = 1; i < n; ++i) {
            dp[i][0] = dp[i - 1][0];
            for (int j = 1; j < 5; ++j) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return Arrays.stream(dp[n - 1]).sum();
    }
}
