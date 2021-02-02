package slidewindow;

/**
 * @author Marshal
 * @date 2021/2/2
 */
public class CharacterReplacement {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        char[] arr = s.toCharArray();

        int left = 0;
        int right = 0;
        // 各字母出现的次数的最大值
        int maxCount = 0;
        // 用来维护字符串中各字母出现的次数
        int freq[] = new int[26];

        while (right < len) {
            freq[arr[right] - 'A']++;
            maxCount = Math.max(maxCount, freq[arr[right] - 'A']);

            if (maxCount + k < right - left + 1) {
                freq[arr[left] - 'A']--;
                // 这里虽然maxCount减小，但是left和right集体右移，窗口大小不变，如果maxCount减小没有意义
                // maxCount一定是增大才会有更优解，这里不维护不会错过最优解，循环还会继续
                left++;
            }

            right++;
        }
        return right - left;
    }
}
