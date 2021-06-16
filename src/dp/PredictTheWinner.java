package dp;

/**
 * @author Marshal
 * @date 2021/6/16
 */
public class PredictTheWinner {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        // 只有一个分数的情况
        if (n == 1) {
            return nums[0] >= 0;
        }

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        // 这里等于也是先手玩家获胜
        return dp[0][n - 1] >= 0;
    }
}
