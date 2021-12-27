package twopointers;

import java.util.Arrays;

/**
 * @author Marshal
 * @since 2021/12/27
 */
public class NumFriendRequests {
    public int numFriendRequests(int[] ages) {
        int n = ages.length;
        Arrays.sort(ages);

        int ans = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            if (ages[i] < 15) {
                continue;
            }
            while (ages[left] <= ages[i] * 0.5 + 7) {
                left++;
            }
            while (right + 1 < n && ages[right + 1] <= ages[i]) {
                right++;
            }
            ans = ans + right - left;
        }
        return ans;
    }
}
