package iterative;

/**
 * @author Marshal
 * @date 2021/5/27
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int ans = 0;
        while (z != 0) {
            ans += z & 1;
            z = z >> 1;
        }
        return ans;
    }
}
