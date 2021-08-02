package unclassified;

/**
 * @author Marshal
 * @date 2021/8/2
 */
public class MinCount {
    public int minCount(int[] coins) {
        int ans = 0;
        for (int coin : coins) {
            ans += (coin + 1) / 2;
        }
        return ans;
    }
}
