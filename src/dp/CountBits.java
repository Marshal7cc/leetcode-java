package dp;

/**
 * @author Marshal
 * @date 2021/3/3
 */
public class CountBits {
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}
