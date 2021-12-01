package array;

/**
 * @author Marshal
 * @since 2021/12/1
 */
public class MaxPower {
    public int maxPower(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();

        int ans = 1;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count += 1;
                ans = Math.max(ans, count);
            } else {
                count = 1;
            }
        }
        return ans;
    }
}
