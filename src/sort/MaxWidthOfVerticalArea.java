package sort;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2023/3/30
 */
public class MaxWidthOfVerticalArea {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int mx = 0;
        for (int i = 1; i < points.length; i++) {
            mx = Math.max(points[i][0] - points[i - 1][0], mx);
        }
        return mx;
    }
}
