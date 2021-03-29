package iterative;

/**
 * @author Marshal
 * @date 2021/3/29
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int ans = 0;
        // 遍历
        for (int i = 0; i < 32 && n != 0; i++) {
            // n&1取最后一位并左移
            ans |= (n & 1) << (31 - i);
            // n右移
            n >>= 1;
        }
        return ans;
    }
}
