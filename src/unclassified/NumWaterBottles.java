package unclassified;

/**
 * @author Marshal
 * @since 2021/12/17
 */
public class NumWaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;

        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int ret = numBottles % numExchange;

            ans += newBottles;
            numBottles = newBottles + ret;
        }

        return ans;
    }
}
