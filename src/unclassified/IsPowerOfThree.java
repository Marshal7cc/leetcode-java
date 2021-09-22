package unclassified;

/**
 * @author Marshal
 * @since 2021/9/23
 */
public class IsPowerOfThree {
    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}
