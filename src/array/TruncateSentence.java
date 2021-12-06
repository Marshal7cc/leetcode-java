package array;

/**
 * @author Marshal
 * @since 2021/12/6
 */
public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        int lastIdx = 0;
        int n = s.length();

        for (int i = 1; i <= n; i++) {
            if (i == n || s.charAt(i) == ' ') {
                k--;
                if (k == 0) {
                    lastIdx = i;
                    break;
                }
            }
        }

        return s.substring(0, lastIdx);
    }
}
