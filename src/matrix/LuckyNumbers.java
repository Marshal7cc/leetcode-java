package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Marshal
 * @since 2022/2/15
 */
public class LuckyNumbers {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        int[] minRow = new int[rowCount];
        Arrays.fill(minRow, Integer.MAX_VALUE);
        int[] maxCol = new int[colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                minRow[i] = Math.min(minRow[i], matrix[i][j]);
                maxCol[j] = Math.max(maxCol[j], matrix[i][j]);
            }
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]) {
                    ret.add(matrix[i][j]);
                }
            }
        }
        return ret;
    }
}
