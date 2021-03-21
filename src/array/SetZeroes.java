package array;

/**
 * @author Marshal
 * @date 2021/3/21
 */
public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        boolean rZeroFlag = false;
        boolean cZeroFlag = false;
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                cZeroFlag = true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                rZeroFlag = true;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (rZeroFlag) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
        if (cZeroFlag) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
