package unclassified;

/**
 * @author Marshal
 * @date 2021/7/14
 */
public class CountTriples {
    public int countTriples(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int value = (int) Math.sqrt(i * i + j * j);
                if (value <= n && value * value == i * i + j * j) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
