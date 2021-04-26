package binarysearch;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/4/26
 */
public class ShipWithinDays {
    public int shipWithinDays(int[] weights, int D) {
        // 找左右边界
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        // 二分
        while (left < right) {
            int mid = (left + right) / 2;
            int count = 1;
            int cur = 0;
            for (int i : weights) {
                if (cur + i > mid) {
                    count++;
                    cur = 0;
                }
                cur += i;
            }
            if (count <= D) {
                // right = mid后结束循环的情况
                // 此时一定有left>=right,left<=mid
                // 所以left=right
                right = mid;
            } else {
                // left = mid+1后结束循环的情况
                // 此时一定有left>=right，并且此时left(mid+1)是need>D的最小值+1，right满足need<=D
                // 所以left=right
                left = mid + 1;
            }

        }
        // 此时其实left一定等于right
        return left;
    }
}
