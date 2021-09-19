package dp;

/**
 * @author Marshal
 * @since 2021/9/19
 */
public class MinSteps {
    public int minSteps(int n) {
        int[] dp = new int[n + 1];

        // dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    dp[i] = Math.min(dp[i], dp[j] + i / j);
                    dp[i] = Math.min(dp[i], dp[i / j] + j);
                }
            }
        }
        return dp[n];
    }
}
