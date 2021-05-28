package bitop;

/**
 * @author Marshal
 * @date 2021/3/22
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            n &= (n - 1);
            ans++;
        }
        return ans;
    }
}
