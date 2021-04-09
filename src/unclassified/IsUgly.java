package unclassified;

/**
 * @author Marshal
 * @date 2021/4/10
 */
public class IsUgly {
    public boolean isUgly(int n) {
        // 处理特殊情况
        if (n <= 0) {
            return false;
        }
        int[] arr = new int[]{2, 3, 5};
        for (int x : arr) {
            // 如果能被整除，那么就除到不能被整除为止
            while (n % x == 0) {
                n = n / x;
            }
        }
        return n == 1;
    }
}
