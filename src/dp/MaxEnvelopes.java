package dp;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/3/4
 */
public class MaxEnvelopes {
    public int maxEnvelopes(int[][] envelopes) {
        int m = envelopes.length;
        // 排序,优先x轴升序排列,若x相同则y倒序排列
        Arrays.sort(envelopes, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            }
            return o1[0] - o2[0];
        });

        int[] dp = new int[m];
        dp[0] = 1;
        int ans = 1;
        for (int i = 1; i < m; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (envelopes[i][1] > envelopes[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    ans = Math.max(ans, dp[i]);
                }
            }
        }

        return ans;
    }
}
