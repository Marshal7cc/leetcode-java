package bitop;

/**
 * @author Marshal
 * @date 2021/5/31
 */
public class IsPowerOfFour {
    public boolean isPowerOfFour(int n) {
        return n > 0 && ((n & (n - 1)) == 0) && ((n & 0xaaaaaaaa) == 0);
    }
}
