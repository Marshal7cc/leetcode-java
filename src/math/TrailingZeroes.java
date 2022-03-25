package math;

/**
 * @author Marshal
 * @since 2022/3/25
 */
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int ans = 0;
        for (int i = 5; i <= n; i = i + 5) {
            for (int j = i; j % 5 == 0; j = j / 5) {
                ans++;
            }
        }
        return ans;
    }
}
