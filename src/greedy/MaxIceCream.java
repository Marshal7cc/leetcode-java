package greedy;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/7/2
 */
public class MaxIceCream {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int ans = 0;
        for (int num : costs) {
            coins -= num;
            if (coins >= 0) {
                ans++;
            } else {
                break;
            }
        }
        return ans;
    }
}
