package bitop;

/**
 * @author Marshal
 * @date 2021/5/30
 */
public class IsPowerOfTwo {
    /**
     * 统计是否只有1位为1
     * 官方有更巧妙地解答
     * 1 return n > 0 && (n & (n - 1)) == 0;
     * 2 return n > 0 && (n & -n) == n;
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >> 1;
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
