package array;

/**
 * @author Marshal
 * @since 2022/5/9
 */
public class DiStringMatch {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int start = 0;
        int end = n;

        int[] ans = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = start++;
            } else {
                ans[i] = end--;
            }
        }
        ans[n] = start;
        return ans;
    }
}
