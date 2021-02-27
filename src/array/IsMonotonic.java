package array;

/**
 * @author Marshal
 * @date 2021/2/28
 */
public class IsMonotonic {
    public boolean isMonotonic(int[] A) {
        int len = A.length;
        if (len == 1) {
            return true;
        }

        // 跳过相等的
        int i = 1;
        while (A[i] - A[i - 1] == 0) {
            if (i == len - 1) {
                return true;
            }
            i++;
        }

        int diff = A[i] - A[i - 1];
        i++;
        while (i < len) {
            if (diff * (A[i] - A[i - 1]) < 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
