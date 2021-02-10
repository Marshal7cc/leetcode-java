package slidewindow;

import java.util.Arrays;

/**
 * @author Marshal
 * @date 2021/2/10
 */
public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (m > n) {
            return false;
        }

        // 记录s1字母出现频率
        char[] arr1 = s1.toCharArray();
        int[] freqS1 = new int[26];
        for (char c : arr1) {
            freqS1[c - 'a']++;
        }

        // 记录s2字母出现频率
        char[] arr2 = s2.toCharArray();
        int[] freqS2 = new int[26];
        for (int i = 0; i < m; i++) {
            freqS2[arr2[i] - 'a']++;
        }

        int left = 0;
        int right = m - 1;
        while (right < n) {
            if (Arrays.equals(freqS1, freqS2)) {
                return true;
            }

            // right到达右边界，说明已经不可能符合条件
            if (right == n - 1) {
                return false;
            }

            freqS2[arr2[left] - 'a']--;
            freqS2[arr2[right + 1] - 'a']++;
            right++;
            left++;
        }

        return false;
    }
}
