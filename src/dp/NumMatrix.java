package dp;

/**
 * @author Marshal
 * @date 2021/3/2
 */
public class NumMatrix {
    private int[][] sum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return;
        }
        int n = matrix[0].length;
        // 二维数组前缀和
        sum = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
//        return sum[row2 + 1][col2 + 1] - sum[row1 + 1][col2 + 1] - sum[row2 + 1][col1 + 1] + sum[row1][col1];
        return sum[row2 + 1][col2 + 1] - sum[row1][col2 + 1] - sum[row2 + 1][col1] + sum[row1][col1];
    }
}
