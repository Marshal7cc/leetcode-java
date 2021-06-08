package dp;

/**
 * @author Marshal
 * @date 2021/6/8
 */
public class LastStoneWeightII {
    public int lastStoneWeightII(int[] stones) {
        if (stones == null || stones.length <= 0) {
            return 0;
        }

        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }

        // 根据推导，当石头最小可能重量时，最好子集数组石头的总重量，趋近于 且 最大为 sum / 2
        int maxWeight = sum / 2;
        int n = stones.length;
        // dp[i] 表示，是否有子集数组，重量和为i
        boolean[] dp = new boolean[maxWeight + 1];
        dp[0] = true;
        for (int stone : stones) {
            for (int i = maxWeight; i >= stone; i--) {
                dp[i] = dp[i] || dp[i - stone];
            }
        }

        // 从 最大值 开始，遍历dp数组，寻找最大i的值
        for (int i = maxWeight; ; i--) {
            if (dp[i]) {
                return sum - 2 * i; // 根据数学推导，计算result
            }
        }
    }
}
