package slidewindow;

/**
 * @author Marshal
 * @date 2021/2/19
 */
public class LongestOnes {
    public int longestOnes(int[] A, int K) {
        int len = A.length;

        //问题已转换为寻找符合区间1的个数不超过K的最长区间
        int left = 0;
        int right = 0;
        int max = 0;
        // 简化：只需要统计两个位置的sum
        //int[] sum = new int[len];
        int lsum = 0;
        int rsum = 0;
        while (right < len) {
            rsum += 1 - A[right];
            // rsum = sum[right]
            // lsum = sum[left-1]
            if (rsum - lsum > K) {
                lsum += 1 - A[left];
                left++;
            } else {
                max = Math.max(right - left + 1, max);
            }
            right++;
        }
        return max;
    }
}
