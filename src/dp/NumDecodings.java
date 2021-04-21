package dp;

/**
 * @author Marshal
 * @date 2021/4/21
 */
public class NumDecodings {
    public int numDecodings(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (arr[i - 1] != '0') {
                dp[i] += dp[i - 1];
            }
            if (i >= 2 && arr[i - 2] != '0' && ((arr[i - 2] - '0') * 10 + (arr[i - 1] - '0')) <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}
