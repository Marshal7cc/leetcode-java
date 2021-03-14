package binarysearch;

/**
 * @author Marshal
 * @date 2021/3/14
 */
public class ArrangeCoins {
    // 等差数列 sum = n*(n+1)/2
    public int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = mid * (mid + 1) / 2;
            if (sum == n) {
                return (int) mid;
            } else if (sum < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // 此时start>end,而结果在上一个start到end之间
        return (int) end;
    }
}
