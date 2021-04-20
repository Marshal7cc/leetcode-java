package unclassified;

/**
 * @author Marshal
 * @date 2021/4/20
 */
public class StrStr {
    public static void main(String[] args) {
        strStr("mississippi", "issip");
    }

    public static int strStr(String haystack, String needle) {
        // 特殊情况处理
        if (needle.isEmpty()) {
            return 0;
        }
        // 求前缀表
        int[] next = getNext(needle);

        int sLen = haystack.length();
        int j = 0;
        for (int i = 0; i < sLen; i++) {
            while (j > 0 && needle.charAt(j) != haystack.charAt(i)) {
                j = next[j - 1];
            }
            if (needle.charAt(j) == haystack.charAt(i)) {
                j++;
            }
            if (j == next.length) {
                return i - needle.length() + 1;
            }
        }
        return -1;
    }

    /**
     * 获取next数组
     *
     * @param pattern
     * @return
     */
    private static int[] getNext(String pattern) {
        int n = pattern.length();
        char[] arr = pattern.toCharArray();

        // 实例化&初始化next数组
        int[] next = new int[n];
        next[0] = 0;

        // j代表前缀末尾的后一位，所以从0开始
        // i代表后缀末尾的后一位
        int j = 0;
        for (int i = 1; i < n; i++) {
            // j要保证大于0，因为下面有取j-1作为数组下标的操作
            while (j > 0 && arr[i] != arr[j]) {
                // 注意这里，是要找前一位的对应的回退位置了
                j = next[j - 1];
            }
            // 如果相等一直向后，并且i,j同时右移
            if (arr[i] == arr[j]) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
