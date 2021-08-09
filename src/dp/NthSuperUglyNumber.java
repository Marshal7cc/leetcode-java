package dp;

/**
 * @author Marshal
 * @date 2021/8/9
 */
public class NthSuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        dp[0] = 1;

        int m = primes.length;
        int[] points = new int[m];

        for (int i = 1; i < n; i++) {
            int next = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                next = Math.min(dp[points[j]] * primes[j], next);
            }
            dp[i] = next;

            for (int j = 0; j < m; j++) {
                if (next == dp[points[j]] * primes[j]) {
                    points[j]++;
                }
            }
        }

        return dp[n - 1];
    }
}
