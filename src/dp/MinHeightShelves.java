package dp;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2023/4/23
 */
public class MinHeightShelves {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        // dp[n]表示放置n本书的最小高度
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1000000);
        // 放0本书时高度为0
        dp[0] = 0;
        for (int i = 0; i < n; ++i) {
            int maxHeight = 0, curWidth = 0;
            for (int j = i; j >= 0; --j) {
                curWidth += books[j][0];
                if (curWidth > shelfWidth) {
                    break;
                }
                maxHeight = Math.max(maxHeight, books[j][1]);
                dp[i + 1] = Math.min(dp[i + 1], dp[j] + maxHeight);
            }
        }
        return dp[n];
    }
}
