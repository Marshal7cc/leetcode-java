package iterative;

/**
 * @author Marshal
 * @date 2021/5/28
 */
public class TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < 30; i++) {
            int count = 0;
            for (int val : nums) {
                count += (val >> i) & 1;
            }
            ans += count * (n - count);
        }
        return ans;
    }
}
