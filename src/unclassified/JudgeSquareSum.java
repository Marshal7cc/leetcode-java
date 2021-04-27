package unclassified;

/**
 * @author Marshal
 * @date 2021/4/28
 */
public class JudgeSquareSum {
    public static void main(String[] args) {
        judgeSquareSum(2147483646);
    }

    public static boolean judgeSquareSum(int c) {
        // 注意溢出
        for (long i = 0; i * i <= c; i++) {
            double j = Math.sqrt(c - i * i);
            if (j == (int) j) {
                return true;
            }
        }
        return false;
    }
}
