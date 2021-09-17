package matrix;

/**
 * @author Marshal
 * @since 2021/9/17
 */
public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][][] subMatrix = new int[3][3][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                if (c != '.') {
                    int index = c - '0' - 1;

                    row[i][index]++;
                    col[j][index]++;
                    subMatrix[i / 3][j / 3][index]++;

                    if (row[i][index] > 1 || col[j][index] > 1 || subMatrix[i / 3][j / 3][index] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
