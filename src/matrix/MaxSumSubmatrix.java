package matrix;

/**
 * @author Marshal
 * @date 2021/4/22
 */
public class MaxSumSubmatrix {
    private static int[][] sum;

    public static void main(String[] args) {
        int[][] num = {{2, 2, -1}};

        maxSumSubmatrix(num, 0);
    }

    public static int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        // 整理出二维数组前缀和
        sum = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + matrix[i][j];
            }
        }


        int ans = Integer.MIN_VALUE;
        for (int row1 = 0; row1 < m; row1++) {
            for (int col1 = 0; col1 < n; col1++) {
                for (int row2 = row1; row2 < m; row2++) {
                    for (int col2 = col1; col2 < n; col2++) {
                        int region = sumRegion(row1, col1, row2, col2);
                        if (region <= k) {
                            ans = Math.max(ans, region);
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row2 + 1][col2 + 1] - sum[row1][col2 + 1] - sum[row2 + 1][col1] + sum[row1][col1];
    }
}
