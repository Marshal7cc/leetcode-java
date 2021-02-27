package divideconquer;

/**
 * @author Marshal
 * @date 2021/2/27
 */
public class LongestSubstring {
    public int longestSubstring(String s, int k) {
        int len = s.length();
        return dfs(s, 0, len - 1, k);
    }

    public int dfs(String s, int left, int right, int k) {
        int[] cnt = new int[26];
        // 统计每个字符出现的频率
        for (int i = left; i <= right; i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        // 如果有字符出现次数小于k,则以之为分隔符分割字符串，分别对子串求解
        char split = 0;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > 0 && cnt[i] < k) {
                split = (char) (i + 'a');
            }
        }

        // 为0表示符合条件
        if (split == 0) {
            return right - left + 1;
        }

        // 得到所有子串,逐一求解，获取最大值
        int i = left;
        int res = 0;
        while (i <= right) {
            while (i <= right && s.charAt(i) == split) {
                i++;
            }
            if (i > right) {
                break;
            }
            int start = i;
            while (i <= right && s.charAt(i) != split) {
                i++;
            }

            int subRes = dfs(s, start, i - 1, k);
            res = Math.max(res, subRes);
        }

        return res;
    }
}
