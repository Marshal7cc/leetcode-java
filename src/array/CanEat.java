package array;

/**
 * @author Marshal
 * @date 2021/6/1
 */
public class CanEat {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = candiesCount.length;
        long[] sum = new long[n];
        sum[0] = candiesCount[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + candiesCount[i];
        }

        int m = queries.length;
        boolean[] ans = new boolean[m];
        for (int i = 0; i < m; i++) {
            int[] query = queries[i];
            int favoriteType = query[0], favoriteDay = query[1], dailyCap = query[2];

            // 当前情况下favoriteDay时候的能吃多少颗糖左右边界
            long left = favoriteDay + 1;
            long right = (long) (favoriteDay + 1) * dailyCap;

            // 第i颗糖的范围
            long x2 = favoriteType == 0 ? 1 : sum[favoriteType - 1] + 1;
            long y2 = sum[favoriteType];

            ans[i] = !(y2 < left || x2 > right);
        }
        return ans;
    }
}
