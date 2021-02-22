package array;

/**
 * @author Marshal
 * @date 2021/2/22
 */
public class IsToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // 简单判断每个元素与右下角元素相等即可
        int m = matrix[0].length;
        int n = matrix.length;

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (matrix[j][i] != matrix[j + 1][i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
