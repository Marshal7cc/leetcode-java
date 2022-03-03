package math;

/**
 * @author Marshal
 * @since 2022/3/3
 */
public class AddDigits {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
