package dp;

/**
 * @author Marshal
 * @date 2021/6/16
 */
public class StoneGame {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        // dp[i][j] 表示当剩下的石子堆为下标 i 到下标 j 时
        // 当前玩家与另一个玩家的石子数量之差的最大值
        int[][] dp = new int[n][n];

        // i=j时,dp[i][j] = piles[i]
        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                // 这里 - 是因为当前玩家角色变换，所以用[-]
                dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
            }
        }

        return dp[0][n - 1] > 0;
    }
}
