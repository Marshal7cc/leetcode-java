package slidewindow;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/2/6
 */
public class MaxScore {
    public static void main(String[] args) {
        int[] arr = {1, 79, 80, 1, 1, 1, 200, 1};
        maxScore(arr, 3);
    }

    public static int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        // 当k = len时，计算下标会出现-1的情况
        if (k == len) {
            return Arrays.stream(cardPoints).sum();
        }
        int start = 0;
        // 右侧下标起始位置
        int end = len - k - 1;
        int maxPoints = 0;

        // 先计算maxPoints初始大小--[len-k,len-1]的和
        for (int i = len - k; i < len; i++) {
            maxPoints += cardPoints[i];
        }

        int curPoints = maxPoints;
        while (end < len - 1) {
            start++;
            end++;
            // 窗口右移, 当前点数curPoints = maxPoints + c[start-1] -c[end];
            curPoints = curPoints + cardPoints[start - 1] - cardPoints[end];
            maxPoints = Math.max(curPoints, maxPoints);
        }
        return maxPoints;
    }
}
