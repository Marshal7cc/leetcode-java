package array;

/**
 * @author Marshal
 * @date 2021/2/25
 */
public class Transpose {
    public int[][] transpose(int[][] matrix) {
        int h = matrix.length;
        int w = matrix[0].length;

        int[][] res = new int[w][h];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }
}
